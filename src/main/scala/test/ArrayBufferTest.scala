package test

import scala.collection.mutable.ArrayBuffer

// Creating Object
object ArrayBufferTest {

  // Main Method
  def main(args: Array[String]) {
    // Instance of ArrayBuffer is created
    val name = ArrayBuffer[String]()
    name += "GeeksForGeeks"
    name += "gfg"
    name += "Chandan"
    println(name)
  }
}
