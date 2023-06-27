

object Alternate_AB {
  def main(args: Array[String]): Unit = {
    val time_to_repeat = 100
    for (i <- 1 to  time_to_repeat) {
      if (i % 2 == 1) {
        print("A")
      } else {
        println("B")
      }
    }
  }
}