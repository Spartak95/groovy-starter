package com.xcoder.homework.missing

class Car {

    def propertyMissing(String name) {
        println "$name method missing"
    }

    def methodMissing(String name, Object arguments) {
        println "$name missing method invoked $arguments"
    }
}
