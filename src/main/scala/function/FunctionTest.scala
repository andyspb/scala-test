package function

object FunctionTest {

  def f2: String = {
    def g(): String = {
      return "test"
    }
    g() + " is this"
  }

  def main(args: Array[String]): Unit = {
    println(f2)
  }

}
