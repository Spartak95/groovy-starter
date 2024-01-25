package com.xcoder.lesson11;

public class Person {
    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    /**
     * For groovy.
     */
    public boolean isCase(Object switchValue) {
        System.out.println("invoke isCase " + switchValue);
        return false;
    }

    public Integer getId() {
        return id;
    }
}
