package com.xcoder.lesson23

import com.xcoder.lesson18.Student

class MissingMethodRunner {
    static void main(String[] args) {
        def student = new Student()
        student.test()
        student.abc

        def map = ["1": 11, "2": 22]
        println map."1"
        println map."2"
    }
}
