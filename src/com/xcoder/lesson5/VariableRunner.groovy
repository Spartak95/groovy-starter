package com.xcoder.lesson5

import groovy.transform.CompileStatic

import java.sql.Date as SqlDate

class VariableRunner {

    def field

    /**
     * byte, short, int, long, BigInteger
     * float, double, BigDecimal
     * char
     * boolean
     */
    @CompileStatic
    static def main(def args) {
        int value = 5
        Integer value2 = 5
        BigInteger bi = 56G
        BigDecimal bd = 5.5G
        BigInteger d = 55G
        BigDecimal er = 8.9G
        def sss = 56G
        def date = new SqlDate(2005, 20, 3)
    }
}
