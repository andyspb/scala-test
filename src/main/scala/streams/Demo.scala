package streams

object Demo {

  import scala.runtime.AbstractFunction1


  def main(args: Array[String]) = {
    val stream = 1 #:: 2 #:: 3 #:: Stream.empty
    // print stream
    println("stream:" + stream)
    // Print first two elements
    stream.take(2).print
    println()
    // Create an empty stream
    val stream1 = Stream.empty[Int]
//    val stream2 = Stream.iterate(0, new Increment())(_ + 1).map(_.toString)
    // Print element
    println(s"Stream1: $stream1")
//    println(s"Stream2: $stream2")
  }

//  class Increment extends AbstractFunction1[Integer, Integer] {
//    override def apply(v1: Integer): Integer = v1 + 1
//  }
}