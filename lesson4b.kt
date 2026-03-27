fun main() {
    // below is a function that is able to add two  numbers
    fun addition () {
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2

        print("The sum of the numbers is: $sum")
    }
    addition()
    println("====================")

    // create a function that is able to multiply three numbers
    fun product () {
        val num1 = 3
        val num2 = 6
        val num3 = 5
        val product = num1 * num2 * num3

        print("The product of the numbers is: $product")
    }
    product()

    println("====================")
    // Given two numbers create a function that is able to find the largest and the smallest of the numbers
    fun number () {
        val x = 2
        val y = 3
        if (x > y){
            println("$x is  larger than $y")
        }
        else if (y > x){
            println("$y is greater than $x")
        }
        else{
            println("Both $x and $y are equal")
        }
    }
    number()

    println("====================")

    // Given 179 minutes, create a function that is able to convert the said minutes in to hours and to shothe reminder of the minutes
    fun minute() {
        var min = 179
        val hours = min / 60 
        val minutes = min % 60
        
        println("the reminder of the minutes is: $hours hours $minutes minutes")
    }
    minute()
}