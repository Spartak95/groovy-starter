package com.xcoder.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {

    static void main(String[] args) {
        def value = "one 1 two 22 three 333"
        def regex = "\\w+ \\d+"
        def regexGroovy = /(\w+) (\d+)/

        Pattern pattern = Pattern.compile(regexGroovy)
        def matcher = pattern.matcher(value)

        boolean result = matcher.matches()

        println "Matches: ${result}"

        while (matcher.find()) {
            println matcher.group()
            println matcher.group(1)
            println matcher.group(2)
            println()
        }

        Pattern patternGroovy = ~regexGroovy
        Matcher matcherGroovy = value =~ regex;
        boolean matchesResultGroovy = value ==~ regex

        println "Matches: ${matchesResultGroovy}"
        println()
        println matcher[0]
        println matcher[1][2]
        println matcher[2]
        println()
        println matcher[1..2]
        println()
        matcher.each {group -> println group}
        matcher.each {(group, group1, group2) -> {
            println group
            println group1
            println group2
        }}
    }
}
