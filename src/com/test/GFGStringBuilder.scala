package com.test

object GFGStringBuilder {
  // Main method
  def main(args: Array[String])
  {

    // Creating StringBuilder
    val x = new StringBuilder("Author");

    // Appending character
    val y = (x += 's')

    // Displays the string after
    // appending the character
    println(y)
  }
}
