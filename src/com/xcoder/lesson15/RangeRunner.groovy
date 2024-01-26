package com.xcoder.lesson15

class RangeRunner {
    static void main(String[] args) {
        def range = 2..8
        assert range.getClass() == IntRange.class

        assert range.get(3) == 5
        assert !range.contains(9)

        range.each { println it }

        println()

        def range2 = 2..<8
        range2.each { println it }

        println()

        ('a'..'d').each {println(it)}

        println()

        (WeakDay.MO..WeakDay.FR).each {println(it)}

        println()

        (WeakDay.WE..WeakDay.MO).each {println(it)}
    }
}
