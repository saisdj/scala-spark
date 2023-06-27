object CountOfEvenNumber_12 {
  def main(args: Array[String]): Unit = {

    var count = 0

    for (int <- 1 to 50) {
      if (int % 2 == 0) {
        count += 1
      }
    }
    println(s"Count of Even Number: $count")
  }
}
