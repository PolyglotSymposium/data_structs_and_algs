class LinkedList() {
  private var elementCount = 1

  def size() : Int = {
    return elementCount
  }

  def next() : Option[LinkedList] = {
    return None
  }

  def add(next : LinkedList) = {
    elementCount += 1
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

  "A linked list with an element added to it" should {
    "have a size of 2" in {
      val first = new LinkedList()
      first.add(new LinkedList())
      first.size() must be_==(2)
    }
  }
}
