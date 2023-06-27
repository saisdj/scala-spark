object DivisibleBy11 {
  def main(args: Array[String]): Unit = {

    for (int <- 250 to 550) {
      if (int % 11 == 0) {
        println(int)
      }
    }
  }
}
