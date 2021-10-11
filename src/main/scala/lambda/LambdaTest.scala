package lambda
//

import org.slf4j.LoggerFactory

import scala.collection.mutable.Map

case class LambdaTest(val first: String, val second: String) {
  override def toString =
    s"[first:$first, second:$second]"
}

object LambdaTest {

  def getMap: List[LambdaTest] => Map[String, LambdaTest] = lambdaTests => {
    val map: Map[String, LambdaTest] = Map[String, LambdaTest]()
    lambdaTests foreach (l => {
      map(l.first) = l
    })
    map
  }

  def inc(a: Int) = a + 1;


  def main(args: Array[String]): Unit = {

    implicit val logger = LoggerFactory.getLogger(this.getClass)

    logger.info("LambdaTest >>")
    var list: List[LambdaTest] = List(LambdaTest("a", "b"), LambdaTest("c", "d"), LambdaTest("e", "f"), LambdaTest("g", "h"))

    var rList: List[Record[String]] = List(new Record("testRecord1"), new Record("testRecord2" ))


//    list.map( a )

//    val l = List(1, 2, 3).filter(x => x >1).map( x => x +1)
//      val l = list.filter(x => x.first != "a").map( x => x.second + "_")
      val l = rList.filter(x => x.record != "a").map( x => x.record = x.getClass.getTypeName)

    l.foreach(println)


    println("<<<")


    list.foreach(l => {
      //print(l + " ")
    })


    val map = getMap(list)

    //map.foreach( m => println(m._2))


    println()
    logger.info("<<<")
  }
}
