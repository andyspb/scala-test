package types

case class employee(name: String, age: Int)

object Main2 {
  // Main method
  def main(args: Array[String]) {
    var c = employee("Andrey", 46)

    // Display both Parameter
    println("Name of the employee is " + c.name);
    println("Age of the employee is " + c.age);
  }
}