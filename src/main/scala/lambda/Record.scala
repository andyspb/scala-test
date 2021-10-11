package lambda

class Record[T](val r: T) {
  type Type = T
  var record: Type = r

  override def toString =
    s"[record:$record]"
}
