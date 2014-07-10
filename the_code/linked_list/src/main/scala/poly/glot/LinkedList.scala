package poly.glot

class LinkedList() {
  private var elementCount = 1
  private var nextElement : Option[LinkedList] = None

  def size() : Int = {
    nextElement match {
      case None => 1
      case Some(next) => 1 + next.size()
    }
  }

  def next() : Option[LinkedList] = {
    return nextElement
  }

  def add(next : LinkedList) = {
    elementCount += 1
    nextElement = Some(next)
  }
}
