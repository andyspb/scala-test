package test

private case class User(name: String, age: Int)

object ForTest {
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
    yield (i, j)

  def main(args: Array[String]): Unit = {
    val userBase = List(User("Travis", 28),
      User("Kelly", 33),
      User("Jennifer", 44),
      User("Dennis", 23))

    val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
      yield user.name

    twentySomethings.foreach(println(_))

    foo(10, 10) foreach {
      case (i, j) =>
        println(s"($i, $j) ")  // выводит (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
    }

  }
}
