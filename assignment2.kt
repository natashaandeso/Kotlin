fun main() {
    
    val year = 2019

    when{
        (year % 400 == 0) -> println("$year is a Leap Year")
        (year % 100 == 0) -> println("$year is Not a Leap Year")
        (year % 4 == 0) -> println("$year is a Leap Year")
        else -> println("$year is Not a Leap Year")
    }
}
// check on the difference between what we call local variables and global variables.