import scala.io.StdIn.readLine

object Main extends App {
  val userInput = getUserInput(readLine())

  def getUserInput(s: String): String = {
    println(s)
    s
  }

  def convertStringArray(s: String): Array[Int] = s.split(" ").map(_.toInt)

  def isInteger(s: String): Boolean = s.forall(_.isDigit)

  def isAllIntegers(s: String): Boolean = s.split(" ").forall(isInteger)

  def matchUserInput(f: String => Boolean, s: String) = f(s) match {
    case true => convertStringArray(s)
  }
}
