package test

object GFGMonads {

  // Main method
  def main(args: Array[String]) {

    // Creating list of numbers
    val list1 = List(1, 2, 3, 4)
    val list2 = List(5, 6, 7, 8)

    // Applying 'flatMap' and 'map'
    val z = list1 flatMap { q =>
      list2 map {
        r => q + r
      }
    }

    // Displays output
    println(z)

  }
}
