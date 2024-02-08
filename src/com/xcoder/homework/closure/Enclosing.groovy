package com.xcoder.homework.closure

class Enclosing {

    void run() {
        def  whatIsThisObject = {getThisObject()}
        assert whatIsThisObject() == this
        def whatIsThis = {this}
        assert whatIsThis() == this
    }
}
