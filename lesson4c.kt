fun main() {
    // functions with parameters
    // parameters are inputs that get passed as argument when invoking a function
    // Note: For parameters you must specify their data types

    fun greeting (name : String) {
        println("Hello $name , Hope you had a good Day!")
    }

    // when the function invoked, you pas a name as an argument
    greeting("James")
    greeting("Natasha")

    println("========================")

    // Below is an example of a function that is able to calculate the BMI of a person
    fun BMI (weight: Double, height : Double) {
        val answer = weight / (height * height)

        println("The BMI of the person is: " + answer)
    }

    BMI(69.5, 1.73)
    BMI(56.6, 1.67)

    println("===================")
    // Create a function that accepts parameters and checks whether a given number is odd or even
    fun number(num: Int) {
        if (num % 2 == 0) {
            println("This is an even number")
        }
        else{
            println("This is an odd number")
        }
        
    }
    number(4)

}
// create a function that accepts parameter that is able to do the conversion of degree celcius into farhenheight
// create a function that is able to culculate the compound interest of a person.

// Research on inheritance in kotlin. Come up with an example of a program