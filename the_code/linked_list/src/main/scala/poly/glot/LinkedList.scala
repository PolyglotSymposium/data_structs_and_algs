package poly.glot

class LinkedList[T]() {
  private var nextElement : Option[LinkedList[T]] = None

  def size() : Int = {
    nextElement match {
      case None => 1
      case Some(next) => 1 + next.size()
    }
  }

  def next() : Option[LinkedList[T]] = {
    nextElement
  }

  def add(next : LinkedList[T]) = {
    nextElement = Some(next)
  }
}
