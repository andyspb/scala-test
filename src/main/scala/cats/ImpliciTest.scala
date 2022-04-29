package cats
import cats.data.EitherT
import cats.implicits._

class ImpliciTest {

  def main(args: Array[String]): Unit = {

    EitherT.liftF("a".some)
    EitherT.liftF(none[String])
  }

}
