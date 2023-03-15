package me.solve.hacker_rank.fp

object ListReplication {
  def f(num:Int,arr:List[Int]):List[Int] = {
    def _f(counter: Int, num: Int, arr:List[Int], result: List[Int]): List[Int] = if(counter >= num) result else _f(counter+1,num, arr, result++arr)
    _f(1,num,arr,arr).sorted
  }
}
