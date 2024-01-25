package com.xcoder.lesson11

class SwitchRunner {

    static void main(String[] args) {
        int x = 12

        switch (x) {
            case String:
                println 0
                break
            case 5:
                println 1
                break
            case new Person(29):
                println 2
                break
            case ~/\d+/:
                println 3
                break
            case { it % 5 == 0}:
                println 4
                break
            case [1, 3, 5, 9]:
                println 5
                break
            default:
                println "None"
                break
        }

        if (x in [1, 2, 6, 8, 12]) {
            println x
        }
    }
}
