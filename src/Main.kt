//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    greet("Lavender")
    modulus(22, 8)
    addNumbers(10,20, 30, 10)
    funFact("I am an Ambivert")
}
fun greet(name: String){
    var greeting = "Hello ${name}"
    println(greeting)
}

fun modulus(a:Int, b:Int): Int{
    var remainder = a % b
    println(remainder)
    return remainder
}

fun addNumbers(num1: Int, num2:Int, num3:Int, num4:Int): Int{
    var sum = num1 + num2 + num3 + num4
    println(sum)
    return sum
}
fun funFact(word: String){
    println(word)
}