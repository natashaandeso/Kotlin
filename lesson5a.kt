class Person{
    // Atrributes/properties/characteristics of a person
    var name = "Natasha"
    var age = 35
    var gender = "Female"

    // Behaviours/actions/doables
    fun walk(){
        println("The person can walk")
    }

    fun speak(){
        println("The person can speak....")
    }

    fun sing(){
        println("The person can sing")
    }
}

fun main (){
    // objects is a real world thing
    // An object is intaciated/created/obtained from/emanated from a class
    // For us to be able to either access the properties/behaviours of a class we require to have an object

    // below we create an object
    var myObject = Person()

    // below we use the dot separator to acces either the function or the properties
    myObject.walk()
    myObject.sing()

    println("The name of the persaon is: " + myObject.name)
}