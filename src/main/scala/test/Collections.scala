package test

/**
 * @author andy
 */
object Collections {
  val list = List();

  def main(args: Array[String]) {
    println("Collecntions::main() >>>")
    val i: Int = 0
    def ++ = i + 1
    while (i < 10) {
      list :+ i
      //      i = i+1
    }

  }

}
