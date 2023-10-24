fun main() {
    var repeat = true
    while (repeat) {
        println("Введите числа и операцию : ")
        val input = readLine()!!
        val result = chetvertaya(input)
        println("Результат: $result")
        println("Хотите продолжить? (1 - да)")
        val choice = readLine()!!.toInt()
        repeat = (choice == 1)
    }

}

fun chetvertaya(string: String): Float {
    var a = ""
    var b = ""
    var c = ""
    var d = true
    for (char in string.replace(" ", "")) {
        if (char.isDigit() || char == '.') {
            if (d) {
                a += char
            } else {
                b += char
            }
        } else if (char in setOf('+', '-', '*', '/')) {
            c = char.toString()
            d = false
        }
    }
    val num1 = a.toFloat()
    val num2 = b.toFloat()
    return when (c) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> 0.0f
    }
}
