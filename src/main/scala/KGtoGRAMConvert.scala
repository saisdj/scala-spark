import scala.io.StdIn

object KGtoGRAMConvert {
  def main(args: Array[String]): Unit = {

    // Weight Input
    println("Enter weight in kilogram:")
    val kilogram = StdIn.readInt()

    // KG to GRAM
    val grams = kilogram * 1000

    // Final Result
    println(s"${kilogram}kg is equal to ${grams}g")
  }
}


