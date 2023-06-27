object PrintSeries_3 {
  def main(args: Array[String]): Unit = {
    val start = 5
    val end = 25
    val step = 2

    for (a <- start to end by step) {
      if (a % 2 == 1) {
        println(s"$a^2")
      }
    }
  }
}