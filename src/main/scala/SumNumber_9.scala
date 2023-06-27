object SumNumber_9 {
    def main(args: Array[String]): Unit = {

      var sum = 0

      for (int <- 56 to 153) {
        sum += int
      }
      println(s" Sum of Number: $sum")
    }
}
