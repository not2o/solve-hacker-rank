package me.solve.hacker_rank.warmup.mini_max_sum

object MiniMaxSum {
    def miniMaxSum(arr: Array[Int]): Unit = {
        val input = arr.toList
        println(f"${input.filterNot(_ == input.max).sum} ${input.filterNot(_ == input.min).sum}")
    }
}
