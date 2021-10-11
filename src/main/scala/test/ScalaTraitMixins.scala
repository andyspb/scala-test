package test

// Trait structure
trait Display {
  def Display()
}

// An abstract class structure
abstract class Show {
  def Show()
}

class CS extends Show with Display {

  // Defining abstract class
  // method
  def Display() {
    // Displays output
    println("GeeksforGeeks")
  }

  // Defining trait method
  def Show() {
    // Displays output
    println("CS_portal")
  }
}

object ScalaTraitMixins {
  def main(args: Array[String]) {

    // Creating object of class CS
    val x = new CS()

    // Calling abstract method
    x.Display()

    // Calling trait method
    x.Show()
  }


}
