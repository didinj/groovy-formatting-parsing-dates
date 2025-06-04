import java.text.SimpleDateFormat

def dateString = "2025-06-04 14:35:20"
def formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
def parsedDate = formatter.parse(dateString)

println "Parsed Date: $parsedDate"