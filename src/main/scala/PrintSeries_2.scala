object PrintSeries_2 {
  def main(args: Array[String]): Unit = {
    val start = 100
    val end = 10000

    for (a <- start to end) {
      if (a % 100 == 0) {
        println(a)
      }

    }
  }
}
