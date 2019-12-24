package com.test

object  GFGArrays {
  // Main method
  def main(args: Array[String])
  {
    // allocating memory of 1D Array of string.
    var days = Array("Sunday", "Monday", "Tuesday",
      "Wednesday", "Thursday", "Friday",
      "Saturday" )

    println("Array elements are : ")
    for ( m1 <-days )
    {
      println(m1)
    }

  }

}
