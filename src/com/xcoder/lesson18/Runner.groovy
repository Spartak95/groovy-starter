package com.xcoder.lesson18

class Runner {
    static void main(String[] args) {
        def student = new Student(firstName: "Petr", lastName: "Petrov", age: 18, "id": 12)
        Student student2 = ['Sveta', 'Svetikova', 30]
        println(student)
        println(student2)

        student.properties.each {println(it)}
        String.mixin(Runner.class)
        "Ivan".printStr()
    }

    static def printStr(String self) {
        println "It's mixin $self"
    }
}
