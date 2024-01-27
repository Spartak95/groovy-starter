package com.xcoder.homework.closure

/**
 * <h3>What Is a Closure?</h3>
 * <p>A closure is an anonymous block of code. In Groovy, it is an instance of the Closure class.
 * Closures can take 0 or more parameters and always return a value.</p>
 * <br>
 * <h3>Closure Declaration</h3>
 * <p>A Groovy Closure contains parameters, the arrow ->, and the code to execute.
 * Parameters are optional and, when provided, are comma-separated.</p>
 */
class ClosurePractice {
    static void main(String[] args) {
        print("Hello Closure!")
        formatToLowerCaseClosure("Hello Closure!")

        println("Executing with the call method:")
        print.call("Hello Closure!")
        formatToLowerCaseClosure.call("Hello Closure!")

        println "Implicit Parameter:"
        greet("Spartak")

        println "Multiple Parameters"
        println "Multiply: 2 * 3 = " + multiply(2, 3)

        println "Parameter Types:"
        assert calculate(12, 4, "ADD") == 16
        assert calculate(43, 8, "DIV") == 5.375

        println "Varargs:"
        println "Sum all numbers: " + addAll.call(1, 2, 3, 4)

        println "Nested Closures:"
        def add = calculateWithNestedClosure(12, 4, "ADD")
        println "Calculate: 12 + 4 = ${add}"

        println "Lazy Evaluation of Strings:"
        def fullName = "Tarly Samson"
        def greetStr = "Hello! ${-> fullName}"
        assert greetStr == "Hello! Tarly Samson"
        fullName = "Jon Smith"
        assert greetStr == "Hello! Jon Smith"

        println "Closures in Collections"
        def list = [10, 11, 12, 13, 14, true, false, "BUNTHER"]
        list.each {
            println it
        }
        assert [13, 14] == list.findAll{ it instanceof Integer && it >= 13 }
        def map = [1:10, 2:30, 4:5]
        assert [10, 60, 20] == map.collect{it.key * it.value}
    }

    static def printWelcome = {
        println "Welcome to Closure"
    }

    static def print = { String name ->
        println name
    }

    static def formatToLowerCase(name) {
        return name.toLowerCase()
    }

    static def formatToLowerCaseClosure = { name ->
        name.toLowerCase()
    }

    static def greet = {
        println "Hello ${it}!"
    }

    static def multiply = { x, y ->
        return x * y
    }

    static def calculate = { int x, int y, String operation ->
        def result = 0

        switch (operation) {
            case "ADD":
                result = x + y
                break
            case "SUB":
                result = x - y
                break
            case "MUL":
                result = x * y
                break
            case "DIV":
                result = x / y
                break
        }

        return result
    }

    static def addAll = { int ... args ->
        args.sum()
    }

    static def calculateWithNestedClosure = { int x, int y, String operation ->

        def log = {
            println "Performing $it"
        }

        def result = 0

        switch (operation) {
            case "ADD":
                log("Addition")
                result = x + y
                break
            case "SUB":
                log("Subtraction")
                result = x - y
                break
            case "MUL":
                log("Multiplication")
                result = x * y
                break
            case "DIV":
                log("Division")
                result = x / y
                break
        }

        return result
    }
}
