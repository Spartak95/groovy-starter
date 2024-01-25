package com.xcoder.lesson6

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 10 % 3 == 1
assert 2**3 == 8
assert 3.intdiv(2) == 1

println(2**3) // power
def result = (int) 3 / 2
def result2 = 3 / 2 as Integer
println(result)
println(result2)
println result * 130 === 130 // equals by ref
println result <=> 130 // comparator