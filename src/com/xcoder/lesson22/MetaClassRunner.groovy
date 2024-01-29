package com.xcoder.lesson22

import com.xcoder.lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MetaClassRunner {
    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        def printlnMethod = customMetaClass.methods.get("println")
        def student = new Student()
        printlnMethod.invoke(student, student, "Test 2")

        // MetaClassImpl
        println(student.metaClass)

        // ExpandoMetaClass
        student.metaClass.abc = "Test property"
        student.metaClass.test = {
            println "It's a new method"
        }

        student.test()
        println(student.metaClass)
    }
}
