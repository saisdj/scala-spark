

object LoopInsideLoop {
  def main(args: Array[String]): Unit = {
    for (s <- 1 to 3) {
      println(s"Outer loop: = $s")

      for (d <- 1 to 5) {
        println(s"Inner loop: = $d")
      }
    }
  }
}
