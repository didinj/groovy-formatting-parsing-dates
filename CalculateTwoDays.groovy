import java.time.LocalDate
import java.time.temporal.ChronoUnit

def start = LocalDate.parse("2025-06-01")
def end = LocalDate.parse("2025-06-15")
def daysBetween = ChronoUnit.DAYS.between(start, end)

println "Days Between: $daysBetween"