package pprinter

import pprint._


object PPrinterTest {

  val pprinter = new PPrinter()

  def main(args: Array[String]) {
//    pprinter.pprintln("Test, files! >>> ")
    pprinter.pprintln(Seq(1, 2, 3), width = 6, height = 3)
  }
}
