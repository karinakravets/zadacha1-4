fun main() {
    println("Результат: " + chetvertaya(readln()))
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
            c = char
            d = false
        }
    }

    val num1 = a.toFloat()
    val num2 = b.toFloat()

    return when (c) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> 0.0f
    }
}