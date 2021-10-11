package types

class Foo[T <: List[_]] {

}

object Foo {
  def main(args: Array[String]): Unit = {
    List(1, 2, 3) foreach print _
    println()


    List(1, 2, 3, 4, 5).foreach(a => print(a))


  }
}


