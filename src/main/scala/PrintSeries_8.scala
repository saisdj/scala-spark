object PrintSeries_8 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 23

    for (a <- start to end) {
      if (a % 2 == 1) {
        println(a)
      }
      else if (a % 5 == 0) {
        println("divisible by 5,")
      }
    }
  }
}
