import java.text.SimpleDateFormat

def date = new Date()
def formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
def formattedDate = formatter.format(date)

println "Formatted Date: $formattedDate"