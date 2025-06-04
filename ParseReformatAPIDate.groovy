import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

def isoDate = "2025-06-04T14:30:00Z"
def parsed = OffsetDateTime.parse(isoDate)
def reformatted = parsed.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z"))

println "Formatted API Date: $reformatted"