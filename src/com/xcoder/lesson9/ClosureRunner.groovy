package com.xcoder.lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
        Function<Integer, Integer> function = value -> value + value
        def result = function.apply(5)
        println(result)

        println()

        Stream.of(1, 2, 3, 4)
                .map(value -> value + value)
                .map(String::valueOf)
                .forEach(System.out::println)

        println()

        Closure closure = value -> value + value
        Stream.of(1, 2, 3, 4)
                .map(closure)
                .map(String::valueOf)
                .forEach(System.out::println)

        println()

        Closure closure2 = value -> value + value
        def result2 = closure2.call(6)
        println(result2)

        println()

        Closure closure3 = value -> value + value
        def result3 = closure3(7)
        println(result3)

        println()

        Closure closure4 = { value ->
            println value
            value + value // return
        }

        def result4 = closure4(8)
        println result4

        println()

        Closure closure5 = { it ->
            it + it
        }

        def result5 = closure5(8)
        println result5

        println()

        Closure closure6 = value -> value + value
        Stream.of(1, 2, 3, 4)
                .map(closure6)
                .map(String.&valueOf)
                .forEach(System.out::println)

        println()

        Closure closure7 = { value = 9 -> value + value }
        def result7 = closure7()
        println(result7)

        println()

        Closure closure8 = { value = 2 -> value + value }
        def result8 = closure8()
        println(result8)

        println()

        int x = 10
        check(x > 0, {println x})

        println()

        int y = 23
        check(y > 0, {println (++y)})
        println y

        println()
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
