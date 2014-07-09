import org.spec2.mutable._

object FizzBuzzSpec extends Specification {
  "The 'Hello World' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
  }
}
