class LinkedList() {
}

import org.specs2.mutable._
object LinkedListSpec extends Specification {
  "A newly initialized LinkedList " should {
    "be okay" in {
      (new LinkedList()) must beSuccessful
    }
  }
}
