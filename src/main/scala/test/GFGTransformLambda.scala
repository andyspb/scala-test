package test

object GFGTransformLambda {

  // Main method
  def main(args: Array[String]) {

    // lambda is passed to f:Int => Double
    val lambda = (r: Int) => 3.14 * r * r
    val result = transform(2, lambda)

    println(result)
  }

  def transform(x: Int, f: Int => Double) = f(x)
}
