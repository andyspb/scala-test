package test

object Curry {
  def main(args: Array[String]) {
    // Partially Applied function.
    val sum = add2(29) _;
    println(sum)
    println(sum(5))
  }

  // Curring function declaration
  def add2(a: Int)(b: Int) = a + b;
}
