package test

object GFGMutableMap {

  // Main method
  def main(args: Array[String]) {

    // Creation of Map having key-value
    // pairs of type (String, Int)
    val mapMut = scala.collection.mutable.Map[String, Int]()

    println("Empty Map: " + mapMut)

    // Adding new entry
    mapMut("Charlie50") = 50
    mapMut("Charlie51") = 51
    mapMut("Charlie52") = 52
    //    mapMut += ("Charlie52" -> 52)

    println("New Entry: " + mapMut)
  }
}
