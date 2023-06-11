package cats

import cats.effect._
import cats.implicits._

object Something extends IOApp {

  override def run(args: List[String]): IO[ExitCode] =
    doBoth.as(ExitCode.Success)

  def doSomething(i: Int): IO[String] = // <1>
    for {
      _ <- IO(println(s"[${Thread.currentThread.getName}] doSomething($i)"))
    } yield s"$i is a very nice number"

  def doSomethingElse(): IO[Int] =
    for {
      _ <- IO(println(s"[${Thread.currentThread.getName}] doSomethingElse()"))
    } yield 12

  val doBoth: IO[Int] =
    for {
      _ <- doSomething(12).start // <2> <3>
      i <- doSomethingElse
    } yield i
}
