package test

object YieldTest {
  def main(args: Array[String]) {
    println("YieldTest")
    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length
  }

}
