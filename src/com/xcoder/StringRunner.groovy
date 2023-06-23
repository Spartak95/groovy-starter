package com.xcoder

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */
def name = "Ivan"
def value = 'Hello "Hi!"'
def stringValue = "Hello $name"
println stringValue

def value2 = """
SELECT *
FROM
table where name = ?
"""

def value3 = """
SELECT *
FROM
table where name = ${getWithPrefix(name)}
"""

// in this case interpolation does not working
value4 = '''
SELECT *
FROM
table where name = $name
'''

def value5 = /Hello word $name/
def value6 = $/Hello word $name/$

static def getWithPrefix(String name) {
    "prefix-" + name // when line is piece, then return keyword is not should
}

println value2
println value3
println value4
println value5
println value6


println name[2] // Ivan -> a
println name[-1] // Ivan -> n in last symbol
println name[1..2] // Ivan -> va
println name * 3 // Ivan -> IvanIvanIvan
println name - 'na'
println name - 'Iv'
