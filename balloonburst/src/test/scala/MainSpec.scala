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
}
