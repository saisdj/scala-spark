
import scala.io.StdIn

object SimpleMath_6 {
  def main(args: Array[String]): Unit = {

    println("Enter 1st number")
    val num_1 = StdIn.readDouble()

    println("Enter 2nd Number")
    val num_2 = StdIn.readDouble()

    println("Enter operator (+, -, *, /):")
    val operator = StdIn.readLine()


    val finalresult = operator match{
      case "+" => num_1 + num_2
      case "-" => num_1 - num_2
      case "*" => num_1 * num_2
      case "/" => num_1 / num_2
    }
    println(s"Final Rsult : $finalresult")
  }
}
