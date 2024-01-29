package com.xcoder.lesson17

class OopRunner {
    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" // setFirstName
        println(student.firstName) // getFirstName
        println(student.'firstName')
        println(student['firstName'])
        println student.@firstName // not recommended
        def student2 = new Student(firstName: "Petr", lastName: "Petrov", age: 18)
        println student2
        Student student3 = ['Sveta', 'Svetikova', 30]
        println(student3)

        def (fn, ln) = student3
        println fn
        println ln

        def students = [student, student2, student3]

        def studentFirstNames = students.collect { it.firstName }
        def studentFirstNames2 = students*.firstName
        def studentFirstNames3 = students.firstName

        println(studentFirstNames)
        println(studentFirstNames2)
        println(studentFirstNames3)
    }
}
