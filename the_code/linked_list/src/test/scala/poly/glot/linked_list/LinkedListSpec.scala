class LinkedList() {
  def size() : Int = {
    return 0
  }

  def next() : Option[LinkedList] = {
    return None 
  }
}

import org.specs2.mutable._

object LinkedListSpec extends Specification {
  "A newly initialized LinkedList " should {
    "have a size of 0" in {
      new LinkedList().size() must be_==(0)
    }
    "have no next element" in {
      new LinkedList().next() must beNone
    }
  }
}
