package com.xcoder.lesson26.task2

class Task2 {
    static void main(String[] args) {
//        Integer.metaClass.getCm {
//           delegate * 10
//        }
//
//        Integer.metaClass.getMm = {
//            delegate
//        }
//
//        Integer.metaClass.getM = {
////            delegate * 1000
//            delegate.cm * 100
//        }

        Integer.metaClass {
            getCm = {
                delegate * 10
            }

            getMm = {
                delegate
            }

            getM = {
//            delegate * 1000
                delegate.cm * 100
            }
        }

        def result = 3.getCm() + 1.getM() - 25.getMm()

        assert result == 1005
    }

    private static Object firstOption() {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm

            assert result == 1005
        }
    }
}
