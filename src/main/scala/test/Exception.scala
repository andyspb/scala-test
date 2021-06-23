package test

import java.io.IOException

// Creating object
object Exception {
  // Main method
  def main(args: Array[String]) {
    try {
      var N = 5 / 0

    }
    catch {
      // Catch block contain cases.
      case i: IOException => {
        println("IOException occured.")
      }
      case a: ArithmeticException => {
        println("Arithmetic Exception occured.")
      }
    }
    finally
    {
      // Finally block will execute
      println("This is final block.")
    }
  }
}
