// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

// Name: Oliver Cruise
// StudentID: 201823825

// function to redact string

fun redact(originalText: String,redacted_word: String,replacement: Char = 'X'): String {    

    // replaces redacted word with the replacement character and repeats for every letter in word

    return originalText.replace(redacted_word,replacement.toString().repeat(redacted_word.length))


}
