package test


final class ArrowAssoc[A](private val self: A) extends AnyVal {
  @deprecated("Use `->` instead...", "2.13.0")
  def →[B](y: B): (A, B) = ->(y)

  @inline def ->[B](y: B): (A, B) = (self, y)
}
