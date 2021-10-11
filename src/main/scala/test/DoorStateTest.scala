package test

trait DoorState

case object Open extends DoorState

case object Closed extends DoorState

object DoorStateTest {
  def main(args: Array[String]) {
    println("DoorStateTest::main()")

    val o = Open;
    val c = Closed

    describeDoor(o)
    describeDoor(c)
  }

  def describeDoor(state: DoorState) =
    state match {
      case Open => println("door is open")
      case Closed => println("door is closed")
    }
}
