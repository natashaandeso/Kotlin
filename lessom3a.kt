fun main() {
    // for loop 
    // It is used to execute a block of code/statement a number of times until a condition is met

    for(number in 1 .. 10){
        println("The count is: $number")
    }

    println("====================")

    // ceate a for loop that is able to print from 50 to 65

    for(number in 50 .. 60){
        println("This is number: $number")
    }

    println("====================")

     // research on how to increment on the for loop by use of steps
     for (i in 20..40 step 2){
        println(i)
     }

     println("====================")
    //  below we find the odd number in the given range
    for (i in 20..40){
        if (i % 2 != 0){
            println(i)
        }
     }

    //  by use of a for loop, generate the multiplication table for 5 from 1 to 5.
     println("====================")
    for(num in 1..5){
        val prod = num * 5
        println("$num * 5= $prod")
    }

     println("====================")

    // create a program that is able to find the factorial of number 5
   var factorial = 1
    for (i in 1..5) {
        factorial = factorial *  i
        println(factorial)
    }
    println("Factorial of 5 is $factorial")
}