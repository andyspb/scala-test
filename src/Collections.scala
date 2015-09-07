
import scala.collection.mutable

/**
 * @author andy
 */
object Collections {
  val list = List();
  
  def main(args: Array[String]) {
    val i: Int = 0
    while(i<10) {
      list :+ i
      i+=1
    }
    
  }

}