package com.xcoder.lesson24

import com.xcoder.lesson18.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr() {
        println "$age, $firstName, $lastName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
