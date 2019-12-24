package com.test

object GFGMutableMap
{

  // Main method
  def main(args:Array[String])
  {

    // Creation of Map having key-value
    // pairs of type (String, Int)
    val mapMut = scala.collection.mutable.Map[String, Int]()

    println("Empty Map: " + mapMut)

    // Adding new entry
    mapMut += ("Charlie" -> 50)

    println("New Entry: " + mapMut)
  }
}