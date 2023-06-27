object PrintEvenNumber_10 {
  def main(args: Array[String]): Unit = {

    for (int <- 700 to 900) {
      if (int % 2 == 0) {
        println(int)
      }
    }
  }
}
