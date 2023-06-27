
import scala.io.StdIn

object TempConvert_C_to_F {
  def main(args: Array[String]): Unit = {

    // Temp Input
    println("Enter the Celsius Temp:")
    val cel = StdIn.readDouble()

    // Temp Convert Celius to Fahrenheit
    val fahr = cel * 9 / 5 +32

    // Final Result
    println(s"${cel} C == ${fahr} F")
  }
}
