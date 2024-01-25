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

        println person?.getId() // ?. null safe

        println()

        def result = x ?: 1 // elvis operator
        println result
    }
}
