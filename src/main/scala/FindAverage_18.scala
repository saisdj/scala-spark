object FindAverage_18 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var count = 0


    for (num <- 24 to 100 ) {
      if (num % 2 == 0) {

        sum += num
        count += 1
      }
    }
        val avg = sum.toDouble / count
        println(s"Average is: $avg")

  }
}
