import org.spec2.mutable._

class FizzBuzzSpec extends Specification {
  "The 'Hello World' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
  }
}
