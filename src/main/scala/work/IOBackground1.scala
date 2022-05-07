package work

import cats.effect.{IO, IOApp}

import scala.concurrent.duration.DurationInt

object IOBackground1 extends IOApp.Simple {

  def proc(latch: IO[Unit], reverseLatch: Int => IO[Unit]) = {
    IO.println("starting") *>
      IO.sleep(100.millis) *>
      IO.println("started") *>
      reverseLatch(10) *>
      latch *>
      IO.sleep(1.second) *>
      IO.pure(42)
  }.guaranteeCase(outcome => IO.println(s"completed with $outcome"))

  override def run: IO[Unit] = {
    IO.deferred[Unit].flatMap { promise =>
      IO.deferred[Int].flatMap { num =>
        val lhs =
          IO.println("main started") *>
            num.get.flatMap(IO.println(_)) *>
            IO.sleep(1.second) *>
            promise.complete(()) *>
            IO.println("background unblocked")

        val rhs = proc(promise.get, num.complete(_).void)

        import cats.implicits._

        (lhs, rhs)
          .parMapN((_, b) => b)
          .attempt
          .void
      }
    }
  }
}
