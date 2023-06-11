package dateTime

object DateTimeTest {

  def main(args: Array[String]): Unit = {
    val millis = System.currentTimeMillis() - 2 * 24 * 60 * 60 * 1000

    println("millis: "  + millis)

  }

}
