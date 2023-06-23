package com.xcoder


import java.util.regex.Pattern

class RegexRunner {

    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
        String regex = /(\w+) (\d+)/

        def pattern = Pattern.compile(regex)
        def pattern2 = ~regex
        def matcher = pattern.matcher(value)
        def matcher2 = value =~ regex

        def result = matcher.matches()
        def result2 = value ==~ regex

        while (matcher.find()) {
            println matcher.group()
            println matcher.group(1)
            println matcher.group(2)
            println "------"
        }

        println matcher[0] // [one 1, one, 1]
        println matcher[1] // [two 22, two, 22]
        println matcher[1][2] // 22
        println matcher[2] // [three 333, three, 333]
        println matcher[1..2]

        println "------"
        matcher.each (group -> println group)

        println "------"
        matcher.each ((group, group2, group3) -> {
            println group
            println group2
            println group3
        })
    }
}
