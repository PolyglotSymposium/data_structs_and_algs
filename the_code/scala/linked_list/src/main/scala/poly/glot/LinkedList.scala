package poly.glot

class LinkedList[T]() {
  private var nextElement: Option[LinkedList[T]] = None
  private var datum: T = _

  def size(): Int = nextElement match {
    case None => 1
    case Some(next) => 1 + next.size()
  }

  def data(): T = {
    return datum
  }

  def setData(d: T) = {
    datum = d
  }

  def next(): Option[LinkedList[T]] = {
    nextElement
  }

  def add(next: LinkedList[T]) = {
    nextElement = Some(next)
  }
}
