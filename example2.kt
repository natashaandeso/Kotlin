open class Animal {
    var name: String = ""

    fun eat() {
        println("$name is eating")
    }
}

class Cat : Animal() {
    fun sleep() {
        println("$name is sleeping")
    }
}

fun main() {
    val myCat = Cat()
    myCat.name = "Kiki"

    myCat.eat()
    myCat.sleep()
}