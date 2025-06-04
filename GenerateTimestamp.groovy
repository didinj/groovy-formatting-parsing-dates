def timestamp = new Date().format("yyyyMMdd_HHmmss")
def filename = "backup_$timestamp.zip"

println "Generated Filename: $filename"
