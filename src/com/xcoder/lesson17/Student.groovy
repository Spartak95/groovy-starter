package com.xcoder.lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def getInfo() {
        Closure closure = {
            println thisObject
            println owner
            println delegate

            Closure second = {
                println thisObject
                println owner
                println delegate
            }

            second()
        }
    }
}
