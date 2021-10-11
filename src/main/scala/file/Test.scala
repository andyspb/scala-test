package file

import org.apache.spark.{SparkConf, SparkContext}

object Test {
  def main(args: Array[String]) {
    println("Test, files! >>> ")
    args.foreach(println)

    val conf = new SparkConf()
      .setAppName("TestFiles")
      .setMaster("local[2]")
      .set("spark.executor.memory", "1g");

    val sc = new SparkContext(conf)

    sc.stop()
  }
}
