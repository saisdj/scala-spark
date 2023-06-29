object D2_OddPlaces_10 {
  def main(args: Array[String]): Unit = {

    val nums = 1 to 100

    //for (i <- 1 to 100) {
    //if (i % 2 == 1) {

    val odd_nums = nums.filter(_% 2 != 0)
    println("Number in odd places:")
    println(odd_nums)

    //println(i)
  }
}



