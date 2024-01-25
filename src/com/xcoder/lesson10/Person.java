package com.xcoder.lesson10;

public class Person {
    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    /**
     * For groovy.
     */
    public boolean asBoolean() {
        return id > 10;
    }

    public Integer getId() {
        return id;
    }
}
