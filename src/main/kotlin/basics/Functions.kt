package basics

class Functions {
}
fun printMessage(message: String ): Unit {
    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String="Info"){
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}
fun multiply(x: Int,y: Int) = x * y
fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(multiply(2, 4))
    println(sum(1, 2))
}