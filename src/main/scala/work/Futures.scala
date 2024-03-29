package work

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Futures extends App {
  def work() = Future {
    Thread.sleep(1000)
  }

  def p1() = work()

  def p2() = work()

  def runSequential() =
    for {
      _ <- p1()
      _ <- p2()
    } yield ()

  def runParallelWaitBoth() = {
    val f1 = p1()
    val f2 = p2()
    for {
      _ <- f1
      _ <- f2
    } yield()
  }

  def runParallelForgetOne() = {
    val f1 = p1()
    val f2 = p2()
    for {
      // forget f1
      _ <- f2
    } yield()

  }


}
