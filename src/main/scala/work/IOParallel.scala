package work

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits.catsSyntaxParallelAp

import scala.concurrent.duration.DurationInt

object IOParallel extends IOApp{

  val work = {
    IO.sleep(1000.millis)
    IO.println("exit from IO")
  }

  val p1 = work
  val p2 = work

  val runSequential = for {
    _ <- p1
    _ <- p2
  } yield ()

  val runParallelWaitBoth = p1.both(p2).void

  val runParallelForgetOne = for {
    fiber <- p1.start // not waiting
    _ <- fiber.join // wait for fiber
    _ <- p2
  } yield ()

  override def run(args: List[String]): IO[ExitCode] = runSequential.as(ExitCode.Success)
}
