package lambda

object Test{

  def main(args: Array[String]) { // Your code here!
    val list = List(100, 300, 500, 345, 789, 900)
    println("Elements in list before lambdas function ::")
    println(list)
    //defining lambdas function here ...
    val valFun = (a: Int) => a + 10
    // calling the function here ///
    val result = list.map(valFun)
    println("result is  ::")
    println("Elements in list after lambdas function ::")
    println(result)
  }
}
