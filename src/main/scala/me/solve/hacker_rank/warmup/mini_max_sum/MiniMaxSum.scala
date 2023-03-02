package me.solve.hacker_rank.warmup.mini_max_sum

object MiniMaxSum {
    def miniMaxSum(arr: Array[Long]): Unit = {
        val input = arr.toList
        val min = input.min
        val max = input.max
        val minSum = if(input.forall(_ == max)) input.drop(1).sum.toLong else input.filterNot(_ == max).sum.toLong
        val maxSum = if(input.forall(_ == min)) input.drop(1).sum.toLong else input.filterNot(_ == min).sum.toLong
        println(f"$minSum $maxSum")
    }
}
