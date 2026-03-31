class Circle {
    // properties 
    var radius = 7
    var pie = 3.142

    // Behaviours
    fun circleArea(){
        val  areaOfCircle = pie * radius * radius
        println("The area of the circle is: " + areaOfCircle)
    }

    fun circleCircumference() {
        val circumference = 2 * pie * radius

        println("The circumference of the circle is: " + circumference)
    }
}

// reate a class for a rectangle and find the area as well the perimeter of the rectangle

class Rectangle {
    // properties
    var length = 46
    var width = 20

    // behavour
    fun rectangleArea(){
        val areaOfRectangle = length * width
        println("The are of the rectangle is: " + areaOfRectangle)
    }

    fun rectanglePerimeter(){
        val perimeterOfRectangle = 2 * (length + width)
        println("The perimeter of the rectangle is: " + perimeterOfRectangle)
    }
}




fun main () {
    // below is our object
    var myCircle = Circle()

    var myRectangle = Rectangle()

    myCircle.circleArea()
    myRectangle.rectanglePerimeter()
}