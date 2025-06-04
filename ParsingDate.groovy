def dateString = "04-06-2025"
def parsedDate = Date.parse("dd-MM-yyyy", dateString)

println "Parsed Date: $parsedDate"

// Parsing with Time and AM/PM Format
def dateTimeString = "06/04/2025 02:30 PM"
def parsedDateTime = Date.parse("MM/dd/yyyy hh:mm a", dateTimeString)

println "Parsed DateTime: $parsedDateTime"

// Error Handling
def invalidDate = "2025/06-04"

try {
    def parsed = Date.parse("yyyy-MM-dd", invalidDate)
    println "Parsed Date: $parsed"
} catch (Exception e) {
    println "Error parsing date: ${e.message}"
}