package com.xcoder.lesson10

class ConditionRunner {

    /**
     * boolean                    is true
     * Collection/Map             is not empty
     * Matcher                    has match
     * String/GString             is not empty
     * Number/Char                != 0
     * reference                  != null
     */
    static void main(String[] args) {
        int x = 10

        if (x > 10) {
            println x
        }

        println "equivalent below"

        if (x) { // != 0
            println x
        }

        def person = new Person(19)

        if (person) {
            println person.getId()
        }

        println "equivalent below"

        println "Person id value: " + person?.getId()?.byteValue() // ?. means null-safe operator

        println()

        def result = x ?: 1 // Elvis operator. It is a shorthand ternary operator used for null-coalescing
        println result
    }
}
