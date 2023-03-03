import java.time.LocalTime
import java.time.format.DateTimeFormatter

val inputTime = "12:00:00PM"

val inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa")
val outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

val time = LocalTime.parse(inputTime, inputFormatter)
val militaryTime = time.format(outputFormatter)

println(militaryTime)

def conversion(time: String): String = {
    val inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa")
    val outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
    val time = LocalTime.parse(inputTime, inputFormatter)
    time.format(outputFormatter)
}

println(conversion("12:00:01PM"))
println(conversion("00:00:01AM"))
println(conversion("01:00:01AM"))
println(conversion("01:00:00AM"))
println(conversion("12:01:01AM"))
println(conversion("12:01:00AM"))