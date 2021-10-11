package types

object Geeks {

  // Main method
  def main(args: Array[String]) {
    val list: List[Any] = List(
      false,
      66677,
      732,
      'a',
      "abs"
    )

    list.foreach(element => println(element))

    val list2: List[AnyVal] = List(
      333, true, false
    )

    list2.foreach(element => println(element))

    val list3: List[AnyRef] = List(
      "GFG", "GEEKSFORGEEKS"
    )

    list3.foreach(element => println(element))
  }


}