import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFlatSpec with Matchers {
  "The Main object" should "say This working?" in {
    Main.test shouldEqual "This working?"
  }
}
