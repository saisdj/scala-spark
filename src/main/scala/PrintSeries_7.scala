object PrintSeries_7 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 23

    for (a<- start to end) {
      if (a % 3 == 0) {
        println("factor of three")
      } else {
        println(a)
      }
    }
  }
}
