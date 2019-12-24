package com.test

object Lambda {
  def main(args:Array[String])
  {
    // lambda expression
    val ex1 = (x:Int) => x + 2

    // with multiple parameters
    val ex2 = (x:Int, y:Int) => x * y

    println(ex1(7))
    println(ex2(2, 3))
  }
}
