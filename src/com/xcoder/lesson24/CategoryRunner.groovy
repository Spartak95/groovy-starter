package com.xcoder.lesson24

import com.xcoder.lesson18.Student

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("Test arg")
        }
    }
}
