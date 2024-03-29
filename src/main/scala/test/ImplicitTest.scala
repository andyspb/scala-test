package test

abstract class Monoid[A] {
  def add(x: A, y: A): A
  def unit: A
}

object ImplicitTest {
  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  def main(args: Array[String]): Unit = {
    println(sum(List.empty[Int]))       // использует intMonoid неявно
    println(sum(List.empty[String]))       // использует intMonoid неявно
    println(sum(List(1, 2, 3)))       // использует intMonoid неявно
    println(sum(List("a", "b", "c"))) // использует stringMonoid неявно
  }
}