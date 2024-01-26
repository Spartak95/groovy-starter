package com.xcoder.lesson12

class LoopsRunner {
    static void main(String[] args) {
        def list = [1, 2, 3, 4]

        for (i in 0..list.size() - 1) {
            println list.get(i)
        }

        println()

        for (value in list) {
            println(value)
        }

        println()

        0.upto(list.size()) {value ->
            println(value)
        }

        println()

        list.size().downto(0) {
            println(it)
        }

        list.size().times {
            println(it)
        }

        println()

        // 0, 3
        0.step(5, 2) {
            println(it)
        }
    }
}
