package com.xcoder

import groovy.transform.CompileStatic

//import java.sql.Date
import java.sql.Date as SqlDate

class VariablesRunner {
    /**
     * byte, short, int, long, BigInteger
     * float, double, BigDecimal
     * char
     * boolean
     */
    @CompileStatic // this annotation in practice use seldom
    static void main(String[] args) {
        // TIPS - use def only for local variables
        int value = 5 // really is Integer
        Integer value2 = 5 // we can def instead of Integer
        BigInteger value3 = 35G // we can def instead of BigInteger
        BigDecimal value4 = 3.3G // we can def instead of BigDecimal
        // def date = new SqlDate()
    }
}
