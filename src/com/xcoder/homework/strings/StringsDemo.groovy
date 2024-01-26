package com.xcoder.homework.strings

class StringsDemo {
    static void main(String[] args) {
        // String concatenation
        assert 'ab' == 'a' + 'b'
        // Triple-single-quoted string
        def a = '''a triple-single-quoted string'''
        def aMultilineString = '''line one
                                         line two
                                         line three'''

        def name = 'Guillaume'
        def greeting = "Hello ${name}"

        assert greeting.toString() == 'Hello Guillaume'

        def sum = "The sum of 2 and 3 equals ${2 + 3}"
        assert sum.toString() == 'The sum of 2 and 3 equals 5'

        def person = [name: 'Guillaume', age: 36]
        assert "$person.name is $person.age years old" == 'Guillaume is 36 years old'

        String thing = 'treasure'
        assert 'The x-coordinate of the treasure is represented by treasure.x' ==
                "The x-coordinate of the $thing is represented by ${thing}.x"

        assert '$5' == "\$5"
        assert '${name}' == "\${name}"

        def sParameterLessClosure = "1 + 2 == ${-> 3}"
        assert sParameterLessClosure == '1 + 2 == 3'

        def sOneParamClosure = "1 + 2 == ${w -> w << 3}"
        assert sOneParamClosure == '1 + 2 == 3'

        def number = 1
        def eagerGString = "value == ${number}"
        def lazyGString = "value == ${ -> number }"

        assert eagerGString == "value == 1"
        assert lazyGString ==  "value == 1"

        number = 2
        assert eagerGString == "value == 1"
        assert lazyGString ==  "value == 2"

        def message = "The message is ${'hello'}"
        assert message instanceof GString

        def result = takeString(message)
        assert result instanceof String
        assert result == 'The message is hello'
    }

    static String takeString(String message) {
        assert message instanceof String
        return message
    }
}
