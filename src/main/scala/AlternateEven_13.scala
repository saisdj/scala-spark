object AlternateEven_13 {
  def main(args: Array[String]): Unit = {

    for (int <- 20 to  140) {
      if (int % 4 == 0)
        println(int)
    }
  }
}
