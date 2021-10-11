package test

class Smartphone(name: String, num: Int) {
  // Class variables
  var number: Int = num
  var nameofcompany: String = name

  // Class method
  def Display() {
    println("Name of the company : " + nameofcompany);
    println("Total number of Smartphone generation: " + number);
  }
}

object Main {

  // Main method
  def main(args: Array[String]) {

    // Class object
    var smartphone = new Smartphone("lg", 16);
    smartphone.Display();
  }
}
