// Create a while loop to print from -20 to +20
fun main() {
    var number = -20

    while (number <= 20){
        println(number)
        number = number + 1
    }

    println("===========================")

    // use a while loop to print all EVEN years from 2000 to 2025
    var year = 2000

    while (year <= 2025){
        if (year % 2 == 0){
            println(year)
        }
        year++
       
    }
}