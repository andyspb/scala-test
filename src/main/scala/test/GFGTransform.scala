package test

object GFGTransform {
  def main(args: Array[String]) {
    // list of numbers
    val l = List(1, 1, 2, 3, 5, 8)

    println(l)

    // squaring each element of the list
    val res1 = l.map((x: Int) => x * x)
    println(res1)

    val res2 = l.map(x => x * x)
    println(res2)
  }
}
