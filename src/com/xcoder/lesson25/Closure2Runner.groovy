package com.xcoder.lesson25

import com.xcoder.lesson17.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }

        println closure.thisObject
        println closure.owner
        println closure.delegate

        def student = new Student("Ivan", "Ivanov", 29)

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()

        student.with closure

        student.getInfo()()
    }
}
