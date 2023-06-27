object PrintSeries_1 {
  def main(args: Array[String]): Unit = {
    val i = 10
    val j = 5

    for (num <- i to -j by -1) {
      val c = num - 1
      println(s"$num@$c, ")
    }
  }
}
