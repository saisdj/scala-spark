

object PrintSeries_9 {
  def main(args: Array[String]): Unit = {

    val start = 0.5
    val end = 5.1
    val step = 0.2

    var b = start
       while (b <= end) {
       println(f"$b%2.1f")
         b = b + step
       }
  }
}
// println(s"$i^2")