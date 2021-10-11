package test

object FoldLeftTest {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val res = numbers.foldLeft(0)((m, n) => m + n)
    println(res) // 55
    val res1 = numbers.foldLeft(0)(_ + _)
    println(res1) // 55

    var count: Int = 0
    numbers.foreach(count += _)
    println(count)

  }

}
