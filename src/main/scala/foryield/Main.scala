package foryield

object Main {
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
    yield (i, j)


  def main(args: Array[String]) {

    foo(10, 10) foreach {
      case (i, j) =>
        println(s"($i, $j) ")  // выводит (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
    }
  }
}
