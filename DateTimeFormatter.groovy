import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

def now = LocalDateTime.now()
def formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
def formatted = now.format(formatter)

println "Formatted LocalDateTime: $formatted"

// Parsing Strings into LocalDate or LocalDateTime
import java.time.LocalDate
import java.time.format.DateTimeFormatter

def dateString = "2025-06-04"
def formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
def parsedDate = LocalDate.parse(dateString, formatter)

println "Parsed LocalDate: $parsedDate"

// Using LocalDateTime
import java.time.LocalDateTime

def dateTimeString = "2025-06-04 15:00"
def formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
def parsedDateTime = LocalDateTime.parse(dateTimeString, formatter)

println "Parsed LocalDateTime: $parsedDateTime"

// Formatting with Locale and Timezone
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.ZoneId

def zoned = ZonedDateTime.now(ZoneId.of("America/New_York"))
def formatter = DateTimeFormatter.ofPattern("EEE, MMM d yyyy HH:mm z")
println "ZonedDateTime: ${zoned.format(formatter)}"
