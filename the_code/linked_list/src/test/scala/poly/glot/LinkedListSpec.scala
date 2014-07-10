package poly.glot

import org.specs2.mutable._

object LinkedLstSpec extends Specification {
  "A newly initialized LinkedList" should {
    val subject = new LinkedList()

    "have a size of 1" in {
      subject.size() must be_==(1)
    }
    "have no next element" in {
      subject.next() must beNone
    }
  }

  "A linked list with an element added to it" should {
    val subject = new LinkedList()
    val addedElement = new LinkedList()
    subject.add(addedElement)

    "have a size of 2" in {
      subject.size() must be_==(2)
    }
    "have the added element as its next element" in {
      subject.next() must be_==(Some(addedElement))
    }
  }

  "A linked list with two elements added to it" should {
    val subject = new LinkedList()
    val addedElement = new LinkedList()
    val anotherAddedElement = new LinkedList()
    subject.add(addedElement)
    addedElement.add(anotherAddedElement)

    "have a size of 3" in {
      subject.size() must be_==(3)
    }
  }
}
