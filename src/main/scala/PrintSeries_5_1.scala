object PrintSeries_5_1 {
  def main(args: Array[String]): Unit = {

    val a = 5
    val b = 11

    for (i <- a to -b by -1) {
      val c = i - 1
      println(s"$a*$c", a * c)
    }
  }
}
