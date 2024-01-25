package com.xcoder.homework.pattern

class PatternDemo {
    static void main(String[] args) {
        def value = "5555 ssss"
        def regex = /\d+/
        def pattern = ~regex
        def matcher = value =~ pattern

        if (matcher.find()) {
            println matcher.group()
        }

        //======================================

        def value2 = "7777"
        def digitRegex = /\d+/
        def pattern2 = ~digitRegex
        def matches = value2 ==~ pattern2

        println "Full matches: ${matches}"

        //======================================

        def value3 = /ssss/
        def regex3 = /\w+/
        // pattern
        def pattern3 = ~regex3
        // matcher
        def matcher3 = value3 =~ pattern3

        if (matcher3.find()) {
            println matcher3.group()
        }

        //======================================

        def value4 = /abcd/
        def regex4 = /\w+/
        def pattern4 = ~regex4
        def matcher4 = value4 =~ pattern4
        def matches4 = matcher4.matches()

        println "Full matches: ${matches4}"
    }
}
