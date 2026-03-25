// When statement
// The when statement in kotlin is like a switch  in other language. It checks a value 
// against multiple condition and exdcutes the matching block
fun main() {
    val marks = 70 

    when (marks){
        in 1 .. 30 -> println("You Failed")
        in 31 .. 50 -> println("You have Average")
        in 51 .. 70 -> println("You have above Average")
        in 71 .. 100 -> println("You Passed")
        else -> println("Invalid score...!")
    }
}
