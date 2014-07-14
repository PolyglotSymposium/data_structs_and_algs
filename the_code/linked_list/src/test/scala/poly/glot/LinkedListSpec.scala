package poly.glot

import org.specs2.mutable._

object LinkedLstSpec extends Specification {
  "A newly initialized LinkedList" should {
    val subject = new LinkedList[ScalaObject]()

    "have a size of 1" in {
      subject.size() must be_==(1)
    }
    "have no next element" in {
      subject.next() must beNone
    }
  }

  "A linked list with an element added to it" should {
    val subject = new LinkedList[ScalaObject]()
    val addedElement = new LinkedList[ScalaObject]()
    subject.add(addedElement)

    "have a size of 2" in {
      subject.size() must be_==(2)
    }
    "have the added element as its next element" in {
      subject.next() must be_==(Some(addedElement))
    }
  }

  "A linked list with two elements added to it" should {
    val subject = new LinkedList[ScalaObject]()
    val addedElement = new LinkedList[ScalaObject]()
    val anotherAddedElement = new LinkedList[ScalaObject]()
    subject.add(addedElement)
    addedElement.add(anotherAddedElement)

    "have a size of 3" in {
      subject.size() must be_==(3)
    }
  }

  "A linked list given a type parameter of Int, that has a value added to it" should {
    val subject = new LinkedList[Int]()
    subject.setData(42)

    "have the integer value that was set" in {
      subject.data() must be_==(42)
    }
    "has a transformed Int in a List, after a map is performed" in {
      subject.mapData[Int]((x: Int) => x + 1) must be_==(List(43))
    }
  }
}
