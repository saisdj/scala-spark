object AlternateEven_14 {
  def main(args: Array[String]): Unit = {

    for (int <- 20 until 140) {
      if(int % 4 == 0)
      println(int + 2)
    }
  }
}
