fun main() {

     fun celsiusToFarenheit(celsius: Double){
        val answer = (celsius * 9/5) + 32

        println("The temperature in farenheit is: $answer")
    }

    celsiusToFarenheit(25.0)

    println("========================")
// create a function that is able to culculate the compound interest of a person.
    fun compoundInterest(principal: Double, rate:Double, time:Double){
        
        val amount = principal * (1 + rate/100).pow(time)
        val interest = amount - principal

        println("The compound interest is: $interest")
    }

    compoundInterest(1200, 48, 3)


}
 