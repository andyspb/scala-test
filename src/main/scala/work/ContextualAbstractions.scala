package work

object ContextualAbstractions {

  val aList = List(2,1,3,4)

  // ordering
  val descendingOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _) // (a,b) => a > b

  val anOrderedList = aList.sorted(descendingOrdering)


  def main(args: Array[String]): Unit = {
    println(anOrderedList)
  }

}
