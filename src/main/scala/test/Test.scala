package test

object Test {
  val multiplier = (i: Int) => i * factor
  var factor = 3

  def main(args: Array[String]) {
    println("multiplier(1) value =" + multiplier(1))
    println("multiplier(2) value =" + multiplier(2))
  }

}
