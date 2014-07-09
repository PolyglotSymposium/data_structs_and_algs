class LinkedList() {
  def size() : Int = {
    return 0
  }
}

import org.specs2.mutable._
object LinkedListSpec extends Specification {
  "A newly initialized LinkedList " should {
    "have a size of 0" in {
      new LinkedList().size() must be_==(0)
    }
  }
}
