package work

import cats.effect.IO
import cats.effect.IOApp.Simple
import cats.effect.kernel.{Async, Sync}
import fs2.{Pipe, Stream, text}
import fs2.io.file.{Files, Path}
import org.slf4j.{Logger, LoggerFactory}
import cats.syntax.flatMap._
import cats.syntax.functor._

import java.io.{BufferedWriter, File, FileWriter}
import java.nio.file.Paths
import scala.io.Codec


object UniqueLong extends Simple {
  private implicit val logger: Logger = LoggerFactory.getLogger(this.getClass)

  def getRandomLongString(): String = {
    val s = System.nanoTime()
    isFileExist(s)
    return s.toString;
  }

  def isFileExist(id : Long) : Boolean = {
    val path = Path.fromNioPath(Paths.get(".", id.toString()))
    logger.info(s"path: ${path.toString}")

    true;
  }

  def pr(b: Byte) : Unit = {
    println(b)
  }




  def testWriteFile[F[_] :Async](bytesIO: Stream[F, Byte], idFile: String): F[Unit] = {

    val path = Path.fromNioPath(Paths.get("./", idFile + ".txt"))
    val fw = new FileWriter(new File(path.toString))
    val sink: Pipe[F, Byte, Unit] = fs2.io.file.Files[F].writeAll(path)
    val decode: Pipe[F, Byte, String] = text.utf8.decode[F]
    for {
      _ <- Sync[F].delay(logger.info(s"testWriteFile() id: ${idFile}"))
      _ <- bytesIO.through(sink).compile.drain
      _ <- Sync[F].delay(logger.info("<<<"))
    } yield (fw.close())
  }

  def fromByteToString[F[_]: Sync, T]: Pipe[F, T, String] = in =>
    in.evalMap(b => Sync[F].delay(s"${b} + s-${b.toString}"))

  def toConsole[F[_]: Sync, T]: Pipe[F, T, Unit] = in =>
    in.evalMap(str => Sync[F].delay(println(str)))

  override def run: IO[Unit] = {
    logger.info("UniqueLong::main>>>")
    val currentDirectory = new java.io.File(".").getCanonicalPath
    logger.info("currentDir: " + currentDirectory)
    val id = getRandomLongString()

    val bytesIO: Stream[IO, Byte] = Stream(49, 44, 50, 44, 51, 44, 52, 44, 53)
    testWriteFile[IO](bytesIO, id)
  }
}

//  // val sink: Pipe[F, Byte, Unit] = Files[F].writeAll(idFile)
//  //    bytes.through(text.utf8Encode).compile.drain
//
//  //    bytesIO.through(toConsole).compile.drain
//  bytesIO.evalMap(e => IO(println(e)))
//  //    bytes.evalMap(println)


//  def testWriteFile1[F[_]](idFile: String): F[Unit] = {
//    val bytesIO: Stream[F, Byte] = Stream(1, 2, 3, 4, 5)
//    for {
//      _ <- IO(logger.info(s"testWriteFile() id: ${idFile}"))
//      //    bytes = Stream(6,7,8,9,10)
////      _ <- bytesIO.evalMap(e => IO(println(e))).compile.drain
//      //      _ <- bytes.evalMap(e => IO(println(e))).compile.drain
//      //      _ <- Stream(11, 12, 13, 14, 15).evalMap { elem => IO.println(elem)}.compile.drain
//      _ <- IO(logger.info("<<<"))
//    } yield ()
//
//  }

//  def main(args: Array[String]): Unit = {
//    logger.info("UniqueLong::main>>>")
//    val currentDirectory = new java.io.File(".").getCanonicalPath
//    logger.info("currentDir: " + currentDirectory )
//    val id =  getRandomLongString()
//    logger.info(s"s: ${id}")
//    testWriteFile(id.toString);
//
//  }
