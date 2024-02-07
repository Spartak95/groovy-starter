package com.xcoder.homework.metaclass

class MetaClassDemo {
    static void main(String[] args) {
        Car car = new Car()
        car.metaClass.go = {
            println owner
            println thisObject
            println delegate

            delegate.metaClass.invokeMethod(car, "start", "BMW")
        }

        car.go()
    }
}
