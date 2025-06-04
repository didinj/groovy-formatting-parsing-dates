def date = new Date()
def formatted = date.format("dd MMM yyyy")

println "Formatted Date: $formatted"

// Using Timezone and locale parameters
def date = new Date()
def formatted = date.format("EEEE, MMMM d, yyyy", TimeZone.getTimeZone("UTC"), Locale.FRANCE)

println "Formatted Date (UTC, French): $formatted"

