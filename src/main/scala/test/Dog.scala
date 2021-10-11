package test

class Dog(name: String, breed: String, age: Int, color: String) {
  println("My name is:" + name + " my breed is:" + breed);
  println("I am: " + age + " and my color is :" + color);

}

object DogMain {

  // Main method
  def main(args: Array[String]) {

    // Class object
    var obj = new Dog("tuffy", "papillon", 5, "white");
  }
}
