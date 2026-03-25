fun main() {
    val marks: Double = 30.5

    if (marks >= 0 && marks <30){
        println("Failed")
    }
    else if(marks >= 30 && marks <= 50){
        println("Average")
    }
    else if (marks > 50 && marks <= 70){
        println("Above Average")
    }
    else if (marks > 70 && marks <= 100){
        println("You passed")
    }
    else{
        println("Invalid score")
    }
}

// fun main() {
//     val marks = 200

//     if (marks < 0 || marks > 100){
//           println("Invalid score")
//     }
//     else if (marks > 0 && marks <= 30){
//         print("You Failed")
//     }
//     else if (marks > 30 && marks <= 50){
//         println("Average")
//     }
//     else if (marks > 50 && marks <= 70){
//         println(" Above Average")
//     }
//     else {
//         println("You passed")
//     }
    

// }