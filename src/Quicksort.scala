

class Quicksort {
  def sort(a: Array[Int]): Array[Int] = {
    if (a.length < 2) a
    else {
      val pivot = a(a.length / 2)
      sort(a filter (pivot>)) ++ (a filter (pivot ==)) ++
        sort(a filter (pivot <))
    }
  }
}

object TestQuicksort {
  def main(args: Array[String]) = {
    val quicksort = new Quicksort
    val a = Array(5, 3, 2, 2, 1, 1, 9, 39, 219)
    println(a.mkString(" "))

    quicksort.sort(a).foreach(n => (print(n), print(" ")))
  }
}