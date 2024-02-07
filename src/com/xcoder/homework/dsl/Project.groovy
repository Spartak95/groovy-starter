package com.xcoder.homework.dsl

class Project {
    Dependency dependency

    def dependency(@DelegatesTo(Dependency) Closure closure) {
        this.dependency = new Dependency()
        dependency.with closure
    }
}
