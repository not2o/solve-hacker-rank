val input = List(1,3,5,7,9)
val maxSum = input.filterNot(_ == input.min).sum
val minSum = input.filterNot(_ == input.max).sum


def miniMaxSum(arr: Array[Long]): Unit = {
    val input = arr.toList
    val min = input.min
    val max = input.max
    val minSum = if(input.forall(_ == max)) input.drop(1).sum.toLong else input.filterNot(_ == max).sum.toLong
    val maxSum = if(input.forall(_ == min)) input.drop(1).sum.toLong else input.filterNot(_ == min).sum.toLong
    println(f"$minSum $maxSum}")
}

val input12 = Array(793810624L, 895642170L, 685903712L, 623789054L, 468592370L)
println(miniMaxSum(Array(1,2,3,4,5)))
println(miniMaxSum(Array(1,3,5,7,9)))
println(miniMaxSum(input12))
println(miniMaxSum(Array(5,5,5,5,5)))