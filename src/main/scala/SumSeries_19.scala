object SumSeries_19 {
  def main(args: Array[String]): Unit = {

    var sum = 0

    for (num <- 5 to 102) {
      sum += num * num
    }
      println(s"Series Sum: $sum")
  }
}
