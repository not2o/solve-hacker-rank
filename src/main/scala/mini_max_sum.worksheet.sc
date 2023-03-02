val input = List(1,3,5,7,9)
val maxSum = input.filterNot(_ == input.min).sum
val minSum = input.filterNot(_ == input.max).sum


def miniMaxSum(arr: Array[Int]): Unit = {
    val input = arr.toList
    println(f"${input.filterNot(_ == input.max).sum} ${input.filterNot(_ == input.min).sum}")
}

println(miniMaxSum(Array(1,2,3,4,5)))
println(miniMaxSum(Array(1,3,5,7,9)))