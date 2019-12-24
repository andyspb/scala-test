package com.test


class ClassWithAuxiliaryCtor(Aname: String, Cname: String) {
  var no: Int = 0;

  def display() {
    println("Author name: " + Aname);
    println("Chapter name: " + Cname);
    println("Total number of articles: " + no);

  }

  // Auxiliary Constructor
  def this(Aname: String, Cname: String, no: Int) {

    // Invoking primary constructor
    this(Aname, Cname)
    this.no = no
  }
}

object ClassWithAuxiliaryCtorTest {
  def main(args: Array[String]) {

    // Creating object of GFG class
    var obj = new ClassWithAuxiliaryCtor("Anya", "Constructor", 34);
    obj.display();
  }
}

