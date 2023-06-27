object AllAlphabets_17 {
  def main(args: Array[String]): Unit = {
    val start: Char = 'A'
    val end : Char = 'Z'

    for (char <- start to end) {
      print(s"$char, ")
    }
  }

}