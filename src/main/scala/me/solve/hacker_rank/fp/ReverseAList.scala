package me.solve.hacker_rank.fp

object ReverseAList {
  def reverse(n: List[Int]): List[Int] = {
    def _reverse(n:List[Int], result: List[Int]): List[Int] = {
        if(n == Nil) result else _reverse(n.tail, n.head :: result)
    }
    _reverse(n, Nil)
}
}
