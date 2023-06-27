package com.xcoder

class ConditionRunner {

    /**
     * boolean is true
     * Collection/Map is not empty
     * Matcher has match
     * String/GString is not empty
     * Number/Char != 0
     * reference != null
     *
     * asBoolean
     */
    static void main(String[] args) {
        int x = 10
        def booleanResult = x > 10

        if (booleanResult) {
            println x
        }

        if (x) {
            println x
        }

        def person = new Person(9)

        if (person) {
            println person.getId()
        }

        person?.getId() // null safe

        def result = x ?: 1 // elvis/ternary operator
        println result
    }
}
