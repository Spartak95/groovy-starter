package com.xcoder.homework.dsl

class ProjectBuilder {

    static Project project(@DelegatesTo(Project) Closure closure) {
        Project project = new Project()

        project.with closure

        project
    }
}
