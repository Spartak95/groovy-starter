package com.xcoder.homework.closure.strategy

class ClosureStrategyDemo {
    static void main(String[] args) {
        def closure = {
            println("Inside closure")
            println("Value from closure: $variable")
            someMethod()
        }

        def delegateObject = [
                variable  : "Value from delegate",
                someMethod: { println("Method from delegate") }
        ]

        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure.delegate = delegateObject

        closure()
    }
}
