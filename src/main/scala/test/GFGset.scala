package test

object GFGset {

  // Main method
  def main(args: Array[String]) {
    // Creating a set
    val s1 = Set(1, 2, 3, 4, 6, 7)
    println(s1)

    // Applying +() method
    val result = s1.+(5)

    // Display output
    println(result)


    // Creating a set
    val s2 = Set(41, 12, 23, 43, 1, 72)
    println(s2)

    // Applying +() method
    val result2 = s2.+(100)

    // Display output
    println(result2)
  }

}
