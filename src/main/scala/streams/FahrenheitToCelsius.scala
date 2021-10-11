package streams

import java.nio.file.Paths
import cats.effect.{ExitCode, IO, IOApp}
//import cats.effect.{Blocker, ExitCode, IO, IOApp}
import fs2.concurrent._
import fs2.{Stream, io, text}

object FahrenheitToCelsius extends IOApp {

//  def putStrLn(s: Any): IO[Unit] = IO(println(s))
//
//
//
//  def fahrenheitToCelsius(f: Double): Double =
//    (f - 32.0) * (5.0 / 9.0)
//
//  //I split reading into separate method
//  def read(blocker: Blocker, over: NoneTerminatedQueue[IO, Double], under: NoneTerminatedQueue[IO, Double]) = io.file.readAll[IO](Paths.get("testdata/fahrenheit.txt"), blocker, 4096)
//    .through(text.utf8Decode)
//    .through(text.lines)
//    .filter(s => !s.trim.isEmpty && !s.startsWith("//"))
//    .map(line => fahrenheitToCelsius(line.toDouble))
//    .evalMap { value =>
//      if (value > 10) { //here we put values to one of queues
//        over.enqueue1(Some(value)) //until we put some queues are not close
//      } else {
//        under.enqueue1(Some(value))
//      }
//    }
//    .onFinalize(
//      over.enqueue1(None) *> under.enqueue1(None) //by putting None we terminate queues
//    )
//  //function write takes as argument source queue and target file
//  def write(s: Stream[IO, Double], blocker: Blocker, fileName: String): Stream[IO, Unit] = {
//    s.map(_.toString)
//      .intersperse("\n")
//      .through(text.utf8Encode)
//      .through(io.file.writeAll(Paths.get(fileName), blocker))
//  }
////
//  val converter: Stream[IO, Unit] = for {
//    over <- Stream.eval(Queue.noneTerminated[IO, Double]) //here we create 2 queues
//    under <- Stream.eval(Queue.noneTerminated[IO, Double])
//    blocker <- Stream.resource(Blocker[IO])
//    _ <- write(over.dequeue, blocker, "testdata/celsius-over.txt") //we run reading and writing to both
//      .concurrently(write(under.dequeue, blocker, "testdata/celsius-under.txt")) //files concurrently
//      .concurrently(read(blocker, over, under)) //stream runs until queue over is not terminated
//  } yield ()
////
//  override def run(args: List[String]): IO[ExitCode] =
//    converter
//      .compile
//      .drain
//      .as(ExitCode.Success)
//
//

//  override def run(args: List[String]): IO[ExitCode] = {
//    println("FahrenheitToCelsius >>>")
//    IO(ExitCode.Success)
//  }

  override def run(args: List[String]): IO[ExitCode] = {
    IO {
      println("test")
    }.as(ExitCode.Success)
  }
}