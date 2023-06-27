object PrintSeries_15 {
  def main(args: Array[String]): Unit = {

    // Pattern
    for (int <- 2 to 16) {
      print(s"$int*${int + 1}, ")
    }
  println()

   // Multiplied Value
    for (int <- 2 to 16) {
      print(s"${int * (int + 1)}, ")
    }
  }
}
