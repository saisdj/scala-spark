object OddNumber_11 {
  def main(args: Array[String]): Unit = {

    for (a <- 251 to 51 by -1) {
      if (a % 2 == 1) {
        println(a)
      }
    }
  }
}
