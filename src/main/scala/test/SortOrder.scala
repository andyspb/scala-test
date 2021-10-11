package test

sealed trait SortOrder

object SortOrder {
  case object Asc extends SortOrder

  case object Desc extends SortOrder

  case object Keep extends SortOrder
}
