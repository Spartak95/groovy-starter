package com.xcoder

import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
        Closure closure = value -> value + value
        def result = closure.call(5)
        println result
        // or
        def result2 = closure(5)
        println result2

        Closure closure2 = { value ->
            println value
            value + value
        }

        Closure closure3 = {
            println it
            it + it
        }

        Closure closure4 = { -> // without parameter
            5
        }

        Closure closure5 = { value = 45 ->
            println value
            value + value
        }

        Stream.of(1, 2, 3, 4)
                .map(closure)
                .map(String::valueOf)
                .forEach(System.out::println)

        Stream.of(1, 2, 3, 4)
                .map(closure)
                .map(String.&valueOf) // closure
                .forEach(System.out::println)

        int x = 10
        check(x > 20, { println x })

        int y = 11
        check(y > 20, { println(++y) })
        println y

        int z = 12
        check(z > 20) { println z }
        println z
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
