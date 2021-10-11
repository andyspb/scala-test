package types

class Addition(i: Int) {
  // using this keyword
  def this(i: Int, j: Int) {
    this(i)
    println(i + " + " + j + " = " + {
      i + j
    })
  }
}

// Creating object
object GFG {
  // Main method
  def main(args: Array[String]) {
    var add = new Addition(15, 12)
  }

}
