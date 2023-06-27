object PrintSeries_4 {
  def main(args: Array[String]): Unit = {

    val a = 7 // Time Repeat
    val b = Seq(5,10)

    for (_ <- 1 to a) {
      for (int <- b) {
        //println(s"$int,")
        print(s"$int,")
      }
    }
  }
}