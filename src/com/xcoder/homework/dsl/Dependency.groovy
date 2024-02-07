package com.xcoder.homework.dsl

class Dependency {
    String group
    String artifact
    String version

    def group(String group) {
        this.group = group
    }

    def artifact(String artifact) {
        this.artifact = artifact
    }

    def version(String version) {
        this.version = version
    }
}
