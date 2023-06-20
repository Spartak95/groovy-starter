package com.xcoder

import java.sql.DriverManager

class HelloWorld {
    Integer value // we be private

    // @PackageScope ~ package-private visibility in java
    static void main(String[] args) {
        String value = "Hello World"
        Class<String> clazz = value.getClass()
        assert clazz == String.class
        println("Hello World")
        println "Hello World"
        println clazz.getClassLoader()
        println DriverManager.class.getClassLoader()
        println HelloWorld.class.getClassLoader()
    }
}
