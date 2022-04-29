package cats

import cats.implicits._
//import cats.syntax.all._
//import cats.syntax.either._

object EitherTest {
  def returnEither(value: String): Either[NumberFormatException, Int] = {
    try {
        Right(value.toInt)
    } catch {
        case ex: NumberFormatException => Left(ex)
      }
  }

  def main(args: Array[String]): Unit = {
    val success1 : Either[Nothing, String] = "a".asRight
    val success2 : Either[Nothing, String]  = "b".asRight
   //success1.right.map(_+1)
    success1.map(println(_))
    success2.map(println(_))

    val e1: Either[String, Int] = Right(5)
    // e1: Either[String, Int] = Right(5)
    val res0 = e1.right.map(_ + 1)
    val f1 = e1.fold(r=>"left", r=>r.toString)
    println("f1: " + f1)


    // res0: Either[String, Int] = Right(6)
    res0.map(println(_))

    val e2: Either[String, Int] = Left("hello")
    // e2: Either[String, Int] = Left("hello")
    e2.right.map(_ + 1)
    // res1: Either[String, Int] = Left("hello")

    val result = util.Try("42".toInt).toEither
    result.fold(
      e => s"Operation failed with $e",
      v => s"Operation produced value: $v"
    )

    println("result: " + result.toOption.getOrElse("21"))

  }

}
