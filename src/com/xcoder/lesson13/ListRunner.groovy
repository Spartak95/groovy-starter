package com.xcoder.lesson13

class ListRunner {
    static void main(String[] args) {
        def list = [1, 3, 5, 6]

        // read
        assert list[2] == 5
        assert list.get(2) == 5
        assert list[-1] == 6
        assert list[1..3] == [3, 5, 6]
        assert list[8] == null

        // write
        list += 9
        list << 10
        list << 11 << 12
        assert list == [1, 3, 5, 6, 9, 10, 11, 12]

        // remove element
        list << 7 << 7
        list -= 7 // remove all 7 elements
        assert list == [1, 3, 5, 6, 9, 10, 11, 12]
        list -= [1, 3]
        assert list == [5, 6, 9, 10, 11, 12]

        // duplicate elements
        list *= 3
        assert list == [5, 6, 9, 10, 11, 12, 5, 6, 9, 10, 11, 12, 5, 6, 9, 10, 11, 12]

        // method queue
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 5
        assert list.tail() == [6, 9, 10, 11, 12, 5, 6, 9, 10, 11, 12, 5, 6, 9, 10, 11, 12]
        assert list.last() == 12

        // flatten
        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]

        // reverse
        assert [1, 2, 3].reverse() == [3, 2, 1]

        // intersect
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]

        // disjoint
        assert [1, 2, 3].disjoint([5, 6, 7])

        // multiple assign
        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7

        func(*[8, 10])
    }

    static def func(def a, def b) {
        println a
        println b
    }
}
