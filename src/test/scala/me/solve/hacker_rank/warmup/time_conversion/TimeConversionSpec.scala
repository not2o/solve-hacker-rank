package me.solve.hacker_rank.warmup.time_conversion

class TimeConversionSpec extends munit.FunSuite {
    test("time conversion") {
        assertEquals(TimeConversion.conversion("12:01:00AM"), "00:01:00")
        assertEquals(TimeConversion.conversion("01:30:00AM"), "01:30:00")
        assertEquals(TimeConversion.conversion("12:00:00PM"), "12:00:00")
        assertEquals(TimeConversion.conversion("06:45:30PM"), "18:45:30")
        assertEquals(TimeConversion.conversion("11:59:59AM"), "11:59:59")
        assertEquals(TimeConversion.conversion("11:59:59PM"), "23:59:59")
    }
}
