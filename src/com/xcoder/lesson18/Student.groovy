package com.xcoder.lesson18

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
@EqualsAndHashCode
//@Immutable
//@Builder
//@Slf4j
// @Canonical -> EqualsAndHashCode, TupleConstructor, ToString
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }
}
