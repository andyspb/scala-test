package underscore


// imports all the members of the package junit. (equivalent to wildcard import in java using *)
//import org.junit.Assert.assertEquals
//import org.junit._

// imports all the members of junit except Before.
//import org.junit.{Before => _, _}

// imports all the members of junit but renames Before to B4.
//import org.junit.{Before => B4, _}

class Underscore {

}

object Underscore {
  def getLength(x: List[List[_]]): Int = x.length

  def main(args: Array[String]) {
    //    assertEquals(getLength(List(List(8), List("str"))), 2)
    //    assertEquals(getLength(List(List(5.00), List("str"))), 2)
    //    assertEquals(getLength(List(List(Array(7)), List("str"))), 2)


    itemTransaction(130) // Buy
    itemTransaction(150) // Sell
    itemTransaction(70) // Need approval
    itemTransaction(400) // Need approval

    val ints = (1 to 4).map(_ => "Int")
    //    assertEquals(ints, Vector("Int", "Int", "Int", "Int"))


    val items = Seq(("candy", 2, true), ("cola", 7, false), ("apple", 3, false), ("milk", 4, true))
    val itemsToBuy = items
      .filter(_._3) // filter in only available items (true)
      .filter(_._2 > 3) // filter in only items with price greater than 3
      .map(_._1) // return only the first element of the tuple; the item name
    //    assertEquals(itemsToBuy, Seq("milk"))

    println(itemsToBuy)

    val times = multiplier _ // reassign multiplier to times
    //    assertEquals(multiplier(8, 13), times(8, 13))

  }

  def itemTransaction(price: Double): Unit = {
    print(price + ": ")
    price match {
      case 130 => println("Buy")
      case 150 => println("Sell")

      // if price is not any of 130 and 150, this case is executed
      case _ => println("Need approval")
    }
  }

  def multiplier(a: Int, b: Int): Int = a * b


}