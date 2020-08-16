import java.io.ByteArrayInputStream
import java.io.StringReader
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.io.StdIn

class MainSpec extends AnyFlatSpec with Matchers {
  "The Main Object" should "accept user input" in {
    val in = new ByteArrayInputStream("test input".getBytes)
    Console.withIn(in) {
      Main.getUserInput(StdIn.readLine()) shouldEqual "test input"
    }
  }

  "convertStringArray" should "convert a list of int strings to an array" in {
    val in = "1 2 3 4"
    Main.convertStringArray(in) shouldEqual Array(1, 2, 3, 4)
  }

  "isInteger" should "return true if the passed string is an integer" in {
    val in = "1"
    Main.isInteger(in) shouldEqual true
  }

  "isInteger" should "return false if the passed string is not an integer" in {
    val in = "x"
    Main.isInteger(in) shouldEqual false
  }

  "isAllIntegers" should "return true if the passed string can be parsed as a list of integers" in {
    val in = "1 2 3 4"
    Main.isAllIntegers(in) shouldEqual true
  }

  "matchUserInput" should "return an array of ints if the passed string contains only integers" in {
    val in = "1 2 3 4"
    Main.matchUserInput(Main.isAllIntegers, in) shouldEqual Array(1, 2, 3, 4)
  }

  "matchUserString" should "return a warning if a passed string is not 'BANK' or 'INFLATE'" in {
    val in = "BALLMER"
    Main.matchUserString(in) shouldEqual "This is not a valid input"
  }
}
