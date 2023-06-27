object PrintSeries_5 {
  def main(args: Array[String]): Unit = {
    val start = 4
    val end = -12
    val step = -1

    //  Pattern
    for (a <- start to end by step) {
      print(s"5*$a, ")
    }

    println()

    // Multiplied value
    for (b <- start to end by step) {
      val c = 5 * b
      print(s"$c, ")
    }
  }
}
