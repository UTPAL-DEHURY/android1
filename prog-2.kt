fun main() {
    val number = 153
    var temp = number
    var sum = 0
    var remainder: Int

    // Calculate the number of digits
    var digits = 0
    var tempForDigits = number
    while (tempForDigits != 0) {
        tempForDigits /= 10
        digits++
    }

    // Calculate the sum of the digits raised to the power of the number of digits
    temp = number
    while (temp != 0) {
        remainder = temp % 10
        var power = 1
        for (i in 1..digits) {
            power *= remainder
        }
        sum += power
        temp /= 10
    }

    if (number == sum) {
        println("Armstrong number")
    } else {
        println("Not an Armstrong number")
    }
}
