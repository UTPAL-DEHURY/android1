fun main() {
    val num = 1011
    var temp = num
    var isDuckNumber = false

    while (temp > 0) {
        if (temp % 10 == 0) {
            isDuckNumber = true
            break
        }
        temp /= 10
    }

    if (isDuckNumber) {
        println("$num is a duck number")
    } else {
        println("$num is not a duck number")
    }
}
