//1

class Book{
  var pages=320
  var title = "Harry Potter and the Sorcerer's Stone"
  var author= "J.K. Rowling"

}

// Write your code above 📕

fun main() {
  
  
}


//2
class Building {
  val yearBuilt = 2016
  val height = 400 // Feet
  val type = "Limestone"
}

fun main() {
  // Write your code below 🏙
  val residentialBuilding= Building()
  println(residentialBuilding.yearBuilt)
  println(residentialBuilding.height)
  println(residentialBuilding.type)

  val commercialBuilding=Building()
  println(commercialBuilding.type)
}


//3

// Write your class below 
class Person(val name:String, val age:Int, val favoriteColor: String)


fun main() {
  // Create your instances below 
  val me=Person("Kila", 3, "black")
  val myFriend=Person("Lexie", 5, "gray")

  println("${me.name} is ${me.age} years old and her favorite color is ${me.favoriteColor}.")

  println("${myFriend.name} is ${myFriend.age} years old and her favorite color is ${myFriend.favoriteColor}.")


}


//4

class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
  // Write your code below 
  var fullName="$firstName $lastName"

  init{
    if(yearsWorked>1){
      println("$fullName is eligible for a raise!")
    }

    else{
      println("$fullName is not eligible for a raise just yet.")
    }
  }


} 

fun main() {
  // Create an instance below 👩🏻‍💼
  val projectManager= Employee("Maria", "Gonzalez", 2)
  
}


//5

class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
  
  init {
    for (comp in competitionsParticipated) {
      println("$name participated in $comp.")
    }
    
  }

  // Write your function below 
  fun speak(){
    println("$name says: Woof!")
  }


}

fun main() {

  // Write your instance below 🐩
  var maxie=Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))

  maxie.speak()


}
