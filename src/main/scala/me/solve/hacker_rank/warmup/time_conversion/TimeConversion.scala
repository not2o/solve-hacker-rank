package me.solve.hacker_rank.warmup.time_conversion

import java.time.format.DateTimeFormatter
import java.time.LocalTime

object TimeConversion {
    def conversion(inputTime: String): String = {
        val inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa")
        val outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        val time = LocalTime.parse(inputTime, inputFormatter)
        time.format(outputFormatter)
    }
}
