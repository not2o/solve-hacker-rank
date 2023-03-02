val candles = List(4L,4L,1L,3)

val max = candles.max
val count = candles.count(_ == max)

println(count)