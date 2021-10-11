package types

trait NotConfigured

trait Configured

class Builder[A] private() {
  def configure(): Builder[Configured] = new Builder[Configured]

  def build()(implicit ev: Builder[A] =:= Builder[Configured]) = {
    println("It's work!")
  }
}

object Builder {
  //  def apply(): Builder[NotConfigured] = {
  //    new Builder[NotConfigured]()
  //  }

  def main(args: Array[String]): Unit = {

    val b = new Builder[String];
    b.configure().build()

    //    Builder()
    //      .configure() // без вызова этого метода компилятор поругается!
    //      .build()

  }
}
