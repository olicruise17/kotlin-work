// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

// Name: Oliver Cruise
// StudentID: 201823825

// function to redact string

fun redact(originalText: String,redacted_word: String,replacement: Char = 'X'): String {


    // splits the string into indivdual words

    val words = originalText.split(" ")
      
    // each word is mapped to the overall result

    val result = words.map { word ->

        // checks if each word is the same as target word and changes word if so

        if (word == redacted_word) {
            replacement.toString().repeat(word.length)
        } else {
            word
            }
        }

    // returns result

    return result.joinToString(" ")

}
