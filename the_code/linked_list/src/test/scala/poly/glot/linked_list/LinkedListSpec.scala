class LinkedList() {
  def size() : Int = {
    return 1
  }

  def next() : Option[LinkedList] = {
    return None
  }
}

import org.specs2.mutable._

object LinkedLstSpec extends Specification {
  "A newly initialized LinkedList " should {
    "have a size of 1" in {
      new LinkedList().size() must be_==(1)
    }
    "have no next element" in {
      new LinkedList().next() must beNone
    }
  }
}
