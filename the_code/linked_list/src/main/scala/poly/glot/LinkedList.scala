package poly.glot

class LinkedList() {
  private var nextElement : Option[LinkedList] = None

  def size() : Int = {
    nextElement match {
      case None => 1
      case Some(next) => 1 + next.size()
    }
  }

  def next() : Option[LinkedList] = {
    nextElement
  }

  def add(next : LinkedList) = {
    nextElement = Some(next)
  }
}
