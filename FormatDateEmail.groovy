def eventDate = Date.parse("yyyy-MM-dd", "2025-06-10")
def formatted = eventDate.format("EEEE, MMMM d, yyyy")

println "Reminder: Your appointment is on $formatted"