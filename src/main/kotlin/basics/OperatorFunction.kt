package basics

class OperatorFunction {
}

fun main() {


    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * " Bye ")
}