package com.xcoder.lesson7

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
  table where name = $name
"""

println value2

// In triple-single-quoted string case does not work interpolated string
value3 = '''
  SELECT * 
  FROM
  table where name = $name
'''

println value3
char value4 = 'H'

def value5 = """
  SELECT * 
  FROM
  table where name = ${getWithPrefix(name)}
"""

static def getWithPrefix(String name) {
    "prefix-" + name // return
}

def value6 = /Hello word $name/
println value6

def value7 = $/Hello word $name/$
println value7

println name[2]
println name[-1] // get last element
println name[1..3]
println name * 3
println name - 'Iv'
println name - 'na'