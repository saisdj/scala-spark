object Printseries_6 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 35

    for (a <- start to end by 2) {
      println(s"$a, even,")
    }
  }
}
