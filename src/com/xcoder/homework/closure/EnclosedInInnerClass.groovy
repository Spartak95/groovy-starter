package com.xcoder.homework.closure

class EnclosedInInnerClass {
    class Inner {
        Closure cl = {
            this
        }
    }

    void run() {
        def inner = new Inner()
        assert inner.cl() == inner
    }
}
