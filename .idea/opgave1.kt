import kotlinx.coroutines.currentCoroutineContext

//https://behu.gitbook.io/ita24-2.-semester/weekly-handins/week-1

fun main() {
    //opgave 1
    /*
    println("Opgave 1")
    //A person is elligible to vote if their age is greater than or equal to 18.
    // Define a method to find out if they are elligible to vote. Let the user input their age.

    //getting user input
    print("Enter your age here:  ")
    val userAge = readln().toInt()
    // println("You entered $userAge")

    fun checkAge (age: Int) {
        if (age < 18) {
            println("You can not vote")
        }
        else {println("You are old enough to vote!")}
    }

    //kalder funktionen med users input
    checkAge(userAge)
     */


    //opgave 2
    println("Opgave 2")
    //Define two functions to print the maximum and the minimum number respectively among three numbers
    fun getMax(a: Int, b: Int, c:Int) {
        if (a>b && a>c) {
            println("$a is larger than $b and $c")
        }
        else if (b>a && b>c) {
            println("$b is larger than $a and $c")
        }
        else if (c>a && c>b) {
            println("$c is larger than $a and $b")
        }
        else {println("Something went wrong - type in different numbers")}
    }

    fun getMin(a: Int, b: Int, c:Int) {
        if (a<b && a<c) {
            println("$a is smaller than $b and $c")
        }
        else if (b<a && b<c) {
            println("$b is smaller than $a and $c")
        }
        else if (c<a && c<b) {
            println("$c is smaller than $a and $b")
        }
        else {println("Something went wrong - type in different numbers")}
    }

    //kalder fun med heltal
    getMax(-1, -1, 5)
    getMin(1,5,7)


    //opgave 3
    println("Opgave 3")
    //Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.
    val numberList:List<Int> = listOf(5,7, 101, 394, 5, 10)

    fun calculateAverage(listOfNumbers: List<Int>):Double {
        val average = listOfNumbers.average() //average funktion set på https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/average.html
        println(average)
        return average
    }
    calculateAverage(numberList) //kalder funktionen med den liste jeg lavede for at tjekke funktionen

    //opgave 4
    println("Opgave 4")
    //Write a method that returns if a user has input a valid CPR number.
    //A valid CPR number has:
       //10 Digits.
        //The first 2 digits are not above 31.
        //The middle 2 digits are not above 12.
    //The method returns true if the CPR number is valid, false if it is not.

    fun checkCPR (cpr:Int) {
        //find 2 first digits

    }


    //opgave 5
    println("Opgave 5")
    //Write a program that prints the numbers from 1 to 100.
        //burde jeg kode det fremfor at lave en liste selv? Ja. Ja det burde jeg
    // But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.

    //pseudo kode: (If number % 3 == 0) {println( "Fizz" )
    // (if number % 5 == 0) {println(" Buzz ")
    // (if number % 3 == 0 && number % 5 == 0) {println ("FizzBuzz")}

    //prøver
    fun fizzBuzz() {
        for (i in 1..100) {
            if (i % 3 == 0 && i%5 == 0) {
                println("FizzBuzz")
            }

            else if (i % 3 == 0) {
                println( "Fizz" )}
            else if (i % 5 == 0) {
                println(" Buzz ")}

            else {println(i)}
        }
    }

    //kalder funktionen  - den er bare lidt fyldene i konsollen når man arbejder
    // fizzBuzz()

    //opgave 6
    println("Opgave 6")
    //Write a program that takes your full name as input and displays the abbreviations of
    // the first and middle names except the last name which is displayed as it is.
    //For example Benjamin Dalsgaard Hughes will be B.D. Hughes

    fun nameChopper(name: String) {
        //splitter navnet op i dele som kommer på en liste
        val listOfNamePieces: List<String> = name.split(" ")

        //finder først forbogstaver for alle elementer
        val allInitials: List<String> = listOfNamePieces.map{ it[0].toString()}

        //fjerner det sidste element - vi har brug for hele efternavnet og ikke kun forbogstavet hertil
        val initials: List<String> = allInitials.dropLast(1) //dropLast søgt frem på chatGPT
        print("$initials ")
            //burde laves til en string i stedet + gerne få . efter hvert bogstav

        //finder efternavn - som her kommer til at være dit sidste navn
        val lastName = listOfNamePieces.last() // last fundet på https://kotlinlang.org/docs/collection-elements.html#retrieve-by-condition
        print(lastName)

    }

    nameChopper("Linea Moltved Skræp")

    //opgave 7...
    println("opgave 7")
    //Write a program that takes a numerical grade (0-100) as input and prints out the corresponding american
    // letter grade. Implement a function calculateGrade that takes an integer parameter representing the grade and returns a string representing the letter grade according to the following scale:
    //90-100: "A"
    //80-89: "B"
    //70-79: "C"
    //60-69: "D"
    //Below 60: "F"

    fun calculateGrade(grade: Int): String {
        return when {
            grade in 90..100 -> "grade is A"
            grade in 80..89 -> "grade is B"
            grade in 70..79 -> "grade is C"
            grade in 60..69 -> "grade is D"
            else -> "F"
        }
    }
    //kalder func med eksem på score
    println(calculateGrade(75))

    //opgave 8
    println("Opgave 8")
    //Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
    // and returns a list containing only the words that have a length greater than or equal to the specified minimum length.
    //Use filter function and lambda expressions

    fun filterWordsByLength(listOfStrings: List<String>, minimumLength: Int) {
        val newList: List<String> = listOfStrings.filter {it.length >= minimumLength}
        println(newList)
    }

    //værdi at putte ind
    val list = listOf("Hejsa", "Goddag", "Hej", "Godmorgen")

    //funktionen kaldes med listen og med en minimunsværdi til ordene
    filterWordsByLength(list, 5)

}
