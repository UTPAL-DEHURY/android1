fun main() {
    val number1 = 24
    val number2 = 18
    
    var num1 = number1
    var num2 = number2
    
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    
    val gcd = num1
    
    println("GCD of $number1 and $number2 is: $gcd")
}
