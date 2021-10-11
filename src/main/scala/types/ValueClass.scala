package types

// Creating a value class and extend with AnyVal
case class ValueClass(name: String) extends AnyVal

// Creating object
object ValueClassObject {
  // Main method
  def main(args: Array[String]) {
    // Creating the instance of the ValueClass
    val c = ValueClass("Andrey")
    c match {
      // new C instantiated here
      case ValueClass("GeeksForGeeks") => println("Matched with GeeksForGeeks")
      case ValueClass("Andrey") => println("Andrey is not correct")
      case ValueClass(x) => println("Not matched with GeeksForGeeks")
    }
  }
}
