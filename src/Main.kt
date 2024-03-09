//import java.lang.ArithmeticException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    var myname : String = "SSS"
//    myname = "Hello"
//    println(myname)
//
//    val username: String = "senthur"
//
//    val minIntValue : Int = Int.MIN_VALUE
//    val minByteValue: Byte = Byte.MIN_VALUE
//    val minLongValue : Long = Long.MIN_VALUE
//    val minShortValue : Short = Short.MIN_VALUE
//    val minDoubleValue : Double = Double.MIN_VALUE
//    val minFloatValue : Float = Float.MIN_VALUE
//    println(username)               // 16bits ( 2 Bytes )       //senthur
//    println("${minDoubleValue}")    // 64bits ( 8 bytes )       //4.9E-324
//    println("${minFloatValue}")     // 32bits ( 4 bytes )       //1.4E-45
//    println("${minLongValue}")      // 64bits ( 8 bytes )       //-9223372036854775808
//    println("${minIntValue}")       // 32bits ( 4 bytes )       //-2147483648
//    println("${minShortValue}")     // 16bits ( 2 bytes )       //-32768
//    println("${minByteValue}")      // 8bits  ( 1 Byte )        //-128
//
//}


//fun main() {
//    val operators = listOf(
//        "+", "-", "*", "/", "%",
//        "=", "+=", "-=", "*=", "/=", "%=",
//        "==", "!=", "<", ">", "<=", ">=",
//        "&&", "||", "!",
//        "and", "or", "xor", "inv", "shl", "shr", "ushr",
//        "+", "-", "++", "--",
//        "?:",
//        "..", "until"
//    )
//
//    var x = 5
//    val i = 3
//
//    for (op in operators) {
//        val result = when (op) {
//            "+" -> x + i                            // Addition: 5 + 3 = 8
//            "-" -> x - i                            // Subtraction: 5 - 3 = 2
//            "*" -> x * i                            // Multiplication: 5 * 3 = 15
//            "/" -> x / i                            // Division: 5 / 3 = 1
//            "%" -> x % i                            // Modulo: 5 % 3 = 2
//            "=" -> i                                // Assignment: 3
//            "+=" -> x + i                           // Addition Assignment: 5 + 3 = 8
//            "-=" -> x - i                           // Subtraction Assignment: 5 - 3 = 2
//            "*=" -> x * i                           // Multiplication Assignment: 5 * 3 = 15
//            "/=" -> x / i                           // Division Assignment: 5 / 3 = 1
//            "%=" -> x % i                           // Modulo Assignment: 5 % 3 = 2
//            "==" -> if (x == i) 1 else 0            // Equality Comparison: 0
//            "!=" -> if (x != i) 1 else 0            // Inequality Comparison: 1
//            "<" -> if (x < i) 1 else 0              // Less Than Comparison: 1
//            ">" -> if (x > i) 1 else 0              // Greater Than Comparison: 0
//            "<=" -> if (x <= i) 1 else 0            // Less Than or Equal To Comparison: 1
//            ">=" -> if (x >= i) 1 else 0            // Greater Than or Equal To Comparison: 0
//            "&&" -> if (x != 0 && i != 0) 1 else 0  // Logical AND: 1
//            "||" -> if (x != 0 || i != 0) 1 else 0 // Logical OR: 1
//            "!" -> if (x == 0) 1 else 0             // Logical NOT: 0
//            "and" -> x and i                        // Bitwise AND: 1
//            "or" -> x or i                          // Bitwise OR: 7
//            "xor" -> x xor i                        // Bitwise XOR: 6
//            "inv" -> x.inv()                        // Bitwise Inversion: -6
//            "shl" -> x shl i                        // Bitwise Left Shift: 40
//            "shr" -> x shr i                        // Bitwise Right Shift: 0
//            "ushr" -> x ushr i                      // Bitwise Unsigned Right Shift: 0
//            "++" -> x + 1                           // Increment: 6
//            "--" -> x - 1                           // Decrement: 4
//            "?:", "..", "until" -> 0                // Not computing results for these operators
//            else -> 0                               // Unknown operator
//        }
//        println("the result of $x $op $i = $result") // Printing the result with comment
//    }
//    var x1 = 10
//    var y = 5
//    var z = 2
//
//
//
//
//    // Elvis Operator ?:
//    var result11 = x1 ?: y
//    println("Elvis Operator Result: $result11") // Output: 10
//
//    //var result11 = x ?: y:
//    //the value of x is not null, so the result is the value of x, which is 10.
//    // The expression does not check the value of y because x is not null.
//    // If x were null, then the value of y would be assigned to result11.
//
//    // Range Operators .., until
//    for (i in x until y) {
//        println("Range Operator Result: $i") // Output: None (empty range)
//    }
//    //This loop iterates over the range from x to y, but x1 is not less than y, so the range is empty, and no output is printed.
//
//
//
//
//    // Multiplicative *, /, %
//    var result1 = x1 * y / z % 3
//    println("Multiplicative Result: $result1") // Output: 1
//    // Shift shl, shr, ushr
//    var result3 = x shl 2 shr 1 ushr 1
//    println("Shift Result: $result3") // Output: 10
//            //x shl 2: This shifts the binary representation of x two positions to the left.
//                    // In binary, 10 is represented as 1010. Shifting it two positions to the left gives us 101000, which is 40 in decimal.
//    //
//            //40 shr 1: This shifts the binary representation of 40 one position to the right.
//                    // In binary, 40 is represented as 101000. Shifting it one position to the right gives us 10100, which is 20 in decimal.
//    //
//            //20 ushr 1: This is similar to shr, but it performs an unsigned right shift, meaning it fills the leftmost bits with zeroes.
//                    // Since 20 in binary is 10100, shifting it one position to the right gives us 1010, which is 10 in decimal.
//    // Bitwise AND and
//    var result6 = x and y
//    println("Bitwise AND Result: $result6") // Output: 0
//            //var result6 = x and y: This line performs a bitwise AND operation between the values of x and y.
//                    // In binary, x is 1010 and y is 0101.
//                    // Performing a bitwise AND operation on corresponding bits gives 0000 (all bits are 0).
//                    // So, result6 is assigned the decimal value 0
//                            //Example
//                                    //       1010   (x)
//                                    //    &  0101   (y)
//                                    //      -------
//                                    //       0000
//    // other two performs wise-versa
//
//    // Bitwise XOR xor
//    var result7 = x xor y
//    println("Bitwise XOR Result: $result7") // Output: 15
//
//    // Bitwise OR or
//    var result8 = x or y
//    println("Bitwise OR Result: $result8") // Output: 15
//fun main(args: Array<String>){
//    val alarm = 10
//
//    when (alarm){
//        in 1..10 -> println("number is in between")
//        1,12,10 -> println("number is found")
//        else -> println("invalid number")
//    }
//    var nullChecker : String? = null
//    println(nullChecker!!.length)
//
//    var nullableString : String ? = "senthur"
//    nullableString?.let {
//        println(it.toUpperCase())
//    }
//}



//fun main(args: Array<String>){
//    var x = 10
//    var y = 3
//    var result = if (x >y && y < x) println("eligible") else println("not eligible")
//    println("${result}")
//}

//fun main(args: Array<String>){
//    var num1 = 40
//    var num2 = 2
//    when {
//        num1 in 50..100   -> println("the number is in range")
//        num1 in num1..num2 && num2 in num1.. num2 -> println("awesome")
//        num1 > num2 -> println("num1 is greater than num2")
//    }
//}
//fun main(args: Array<String>){
//    var star = "*"
//    for (i in 1..5) {
//        val res = star.repeat(i)
//        println(res)
//    }
//    println()
//    println()
//    println()
//    first("Hello how are you")
//    equations(listOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9))
//}
//fun first(word : String){
//    val x : String? = word
//    if (x != null) println("the length of the word is ${x.length}")
//    val safeCalls : String? = "sun"
//    val length : Int?  = safeCalls?.length
//    println(length)
//
//    val elvisOperator : String? = null
//    println(elvisOperator?: "You must have some test")
//
//    val safecasts : String? = null
//    val ultrastructure : String? = safecasts as? String
//    val safecastresult2 = ultrastructure?.length
//
//    val three = safecastresult2?: "enter"
//    val four = three!!
//
//    println("${four}")
//}
//fun equations(numbers : List<Int>){
//    var evennumbers = numbers.filter{ it % 2 == 0}
//    println("Even Numbers : ${evennumbers}")
//    var doubleEach = numbers.map { it * 2 }
//    println("Double numbers : ${doubleEach}")
//    val sum = numbers.reduce{acc, i -> acc + i  }
//    println("sum of numbers : ${sum}")
//
//    val product = numbers.reduce{acc, i -> acc * i  }
//    println("product is ${product}")
//}


//fun main(){
//    intro("senthur",29)
//    var validConnection = true
//    if (!validConnection)
//    getNetwork("Hello you got connection")
//    else
//    showmessage()
//}
//fun intro(name : String, age : Int){
//    println("your name is ${name} and you are ${age} years old")
//}
//fun getNetwork(data : String){
//    println("your connection results : ${data}")
//}
//fun showmessage(){
//    println("no internet connection")
//}


//fun main(){
//    val max = getMarks(50 ,60)
//    println(max)
//
//    val numbers = listOf(3, 7, 2, 8, 5)
//    val maximumresult = maximumFinder(numbers)
//
//    println(maximumresult)
//}
//fun getMarks(a : Int, b : Int) : Int{
//    val maximum = if (a > b) a else  b
//    return maximum
//}
////Find the maximum value in a list
//fun maximumFinder(listNumbers: List<Int>): Int{
//    var minimum = Int.MIN_VALUE
//    for (numbers in listNumbers){
//        if ( numbers > minimum){
//            var elvis = numbers?: Int
//            minimum = elvis as Int
//        }
//    }
//    return minimum
//}

//fun main(){
//    println("Enter the number of students :")
//    var noofStudents = readLine()?.toIntOrNull()?: 0
//    var totalGrade = 0.0
//    for (i in 1..noofStudents){
//        println("Enter student marks out of 100 :")
//        var marks = readLine()?.toDoubleOrNull()?: 0.0
//        totalGrade += marks
//    }
//    var result = if (noofStudents > 0 ) totalGrade / noofStudents else 0.0
//    println(result)
//}

//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    for (number in numbers) {
//        println("checking number : ${number}")
//        if (number == 7) {
//            println("number found ")
//            break
//        }
//    }
//
//    val numbers2 = listOf(1, 2, -3, 4, -5, 6, -7, 8, 9, -10)
//    for (number in numbers2){
//        if( number < 0){
//            println("skipping negative number : ${number}")
//            continue
//        }
//        println("Processing only positive numbers : $${number}")
//    }
//}

//fun main(){
//    findingNumber()
//}
//fun findingNumber(){
//    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50)
//    for (number in numbers){
//        if (number == 33) {
//            println("found the number : ${number ?: "hello"}")
//            continue
//        }
//        if (number %2 == 0) {
//            println("number % by 2 : ${number}")
//            continue
//        }
//        if (number % 5 == 0){
//            println("number divisible by 5 : ${number}")
//
//        }
//println("the remaining : ${number}")
//    }
//}

//fun main() {
//    findingNumber()
//}
//
//fun findingNumber() {
//    val numbers = listOf(7, 2, 3, 4, 5, 6, 1, 8, 9, 10, 20, 30, 40, 50)
//    for (number in numbers) {
//        if (number == 33) {
//            println("found the number : ${number}")
//            continue // move to the next iteration
//        }
//        if (number == 7){
//            println("number ${number} found")
//            continue
//        }
//        if (number % 4 == 0) {
//            println("number % by 2 : ${number}")
//            continue // move to the next iteration
//        }
//        println("This number won't satisfy above condition : ${number}")
//    }
//}

//fun main() {
//    println("--------------------------")
//    findingNumber() // Call the findingNumber function
//}
//
//fun findingNumber() {
//    val numbers = listOf(7, 2, 3, 4, 5, 6, 1, 8, 9, 10, 20, 30, 40, 50) // Initialize a list of numbers
//    for (number in numbers) {                                           // Iterate over each number in the list
//        if (number == 33) {                                             // Check if the current number is equal to 33
//            println("found the number : ${number}")                     // Print "found the number : 33"
//            println("--------------------------")
//                                                                // Move to the next iteration
//        }
//        if (number == 7) {                                              // Check if the current number is equal to 7
//            println("number ${number} found")                           // Print "number 7 found"
//            println("--------------------------")
//                                                                // Move to the next iteration
//        }
//        if (number % 4 == 0) {                                          // Check if the current number is divisible by 4
//            println("number % by 2 : ${number}")                        // Print "number % by 2 : {number}"
//            println("--------------------------")
//                                                                // Move to the next iteration
//        }
//        if (number == 0 ){                                              // checks whether number is equal to 0
//            println("number not found")
//            break                                                       // break statement won't work in this program, GUESS WHY!!
//        }
//        println("This number won't satisfy above condition : ${number}") // Print "This number won't satisfy above condition : {number}"
//        println("--------------------------")
//    }
//}


//fun main(){
//    val person = className()
//    person.Student = "selvaa"
//    person.age   = 29
//    person.speak()
//
//}
//class className{
//    var Student : String = ""
//    var age : Int = 0
//     fun speak(){
//         println("hello my name is ${Student} and im ${age} years  ")
//     }
//}

//fun main(){
//    val result = calculateSum(5,8)
//    println(result)
//}
//fun calculateSum(a:Int, b:Int):Int  {
//    val sum = a +  b
//    return sum
//}


//fun main(){
//    val numbers = listOf(-1, -3, 5, -2, -7)
//    positiveFinder(numbers)
//
//}
//fun positiveFinder(numbers : List<Int>): Int?{
//    for (number in numbers){
//        if (number >0) {
//            println("found positive number is : ${number}")
//            continue
//        }
//    }
//    return null



//class NetworkException(message : String) : Exception(message)

//fetchDataFromRemoteServer
//processResult
//closeConnectionToRemoteServer

//fun fetchDataFromRemoteServer(): String{
//
//    return "some data for verification"
//}
//fun processResult(data: String){
//    var conditions = true
//    if (conditions){
//        throw NetworkException("Unable to fetch data from server")
//    }
//    println("encrypting the received data, Result : ${data}")
//}
//fun closeConnectionToRemoteServer(){
//    println("closing connection")
//}
//
//fun main(){
//    try {
//        var fetchedData = fetchDataFromRemoteServer()
//        processResult(fetchedData)
//    }catch (e:NetworkException){
//        val res = e.message
//        kotlin.io.println("Network error occured ${res}")
//    }finally {
//        closeConnectionToRemoteServer()
//    }
//}

//
//fun main(){
//    println("please enter your name").toString()
//    var username = readLine().toString()
//    println("Enter your age")
//    var userage = readLine()?.toInt()
//    if (userage != null) {
//        details(name = username, age = userage)
//    }
//}
//fun details(name : String, age : Int){
//    println("person's name : ${name} and his age is ${age}")
//}

//class Calculator {
//    fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//
//    fun subtract(a: Int, b: Int): Int {
//        return a - b
//    }
//
//    fun multiply(a: Int, b: Int): Int {
//        return a * b
//    }
//
//    fun divide(a: Int, b: Int): Int {
//        require(b != 0) { "Cannot divide by zero" }
//        return a / b
//    }
//}
//
//fun main() {
//    val calculator = Calculator()
//    println(calculator.add(5, 3))       // Output: 8
//    println(calculator.subtract(5, 3))  // Output: 2
//    println(calculator.multiply(5, 3))  // Output: 15
//    println(calculator.divide(10, 2))    // Output: 5
//}

//
//class Person(var name: String?, var age: Int?){
//    fun details(){
//        println("name : ${name} and age : ${age}")
//    }
//    fun erase_details(){
//
//    }
//
//
//}
//fun main(){
//
//
//    println("Enter your name : ")
//    var name = readLine()?.toString()
//    println("please check whether name you entered is ${name?.toUpperCase()}, because you can't change it for 7 days")
//    println("please enter Y / N")
//    val yesOrNo = readLine()?.trim()?.toLowerCase()
//    if (yesOrNo ==  "y" ){
//        println("Thank you, Let's proceed to next step")
//    }else if (yesOrNo == "n"){
//        println("Please enter your Name and Try Again: ")
//        val nameSpellChange = readLine()?.trim()?.toUpperCase()
//        if (name != null) {name = nameSpellChange}
//        println("Your updated name is ${name}")
//    }
//
//
//
//
//    println("Enter your age : ")
//    val age = readLine()?.toIntOrNull()
//    println("please check whether name you entered is ${age}, because you can't change it for 7 days")
//    println("please enter Y / N")
//    val yesOrNo2 = readLine()?.trim()?.toLowerCase()
//    if (yesOrNo2 ==  "y" ){
//        println("Thank you, Let's proceed to next step")
//    }else if (yesOrNo2 == "n"){
//        println("Please enter your Name and Try Again: ")
//        val ageChange = readLine()?.trim()
//        if (name != null) {var age = ageChange}
//        println("Your updated name is ${age}")
//    }
//
//    if (age!= null && name!= null){
//        val person1  = Person(name, age)
//        person1.details()
//    }
//
//}

//class BankAccount(private var balance: Double) {
//    fun deposit(amount: Double) {
//        require(amount > 0) { "Deposit amount must be positive" }
//        balance += amount
//    }
//
//    fun withdraw(amount: Double) {
//        require(amount > 0) { "Withdrawal amount must be positive" }
//        require(balance >= amount) { "Insufficient funds" }
//        balance -= amount
//    }
//
//    fun getBalance(): Double {
//        return balance
//    }
//}
//
//fun main() {
//    val account = BankAccount(1000.0)
//    var userDeposit = readLine()?.toDouble()
//    if (userDeposit != null){
//        account.deposit(userDeposit)
//        println("Current balance: ${account.getBalance()}")  // Output: Current balance: 1300.0
//    }
//    var userWithdraw = readLine()?.toDouble()
//    if (userWithdraw != null){
//        account.withdraw(userWithdraw)
//        println("your balance after withdrawal : ${account.getBalance()}")
//    }
//
//}


//class User(name: String, age: Int) {
//    val name: String
//    val age: Int
//
//    init {
//        require(age >= 0) { "Age cannot be negative" } // Validation check
//        this.name = name
//        this.age = age
//        println("User initialized: $name, $age years old")
//        println("this is git example")
//    }
//}
//fun main() {
//    User("git", 30) // Creating a user object triggers the initialization block
//    User("Bob", -5) // This will throw an IllegalArgumentException due to negative age
//
//}


//Init KEYWORD
// class Person(var name: String){
//     var age : Int = 10
//    init{
//        println("${name} and he is ${age} years old")
//    }
// }
//fun main(){
//    Person("senthur")
//}

//init CONTINUE
//class Person(name : String, birthYear : Int){
//    var name : String = ""
//    var age : Int = 0
//    var birthYear : Int = 0
//    init {
//        if (birthYear <= 1900) {"invalid year"}
//        this.birthYear = birthYear
//        this.name = name
//        calculateAge()
//        println("$name is $age years old")
//    }
//    private fun calculateAge(){
//        val currentYear : Int = 2024
//        age = currentYear - birthYear
//    }
//    fun celebrate(){
//        age++
//        println("$name celebrates the birthday and now he's $age")
//    }
//}
//fun main(){
//    println("Enter your name : ")
//    var userNmae = readLine()?.toString()
//    println("Enterr your birthyear :")
//    var userBirthyear = readLine()?.toInt()
//    var person = Person(userNmae ?: "", userBirthyear ?: 0)
//    person.celebrate()
//}


//// Primary constructor defined in the class header
//class Person(val name: String, val age: Int) {
//
//    // Secondary constructor defined inside the class body
//    constructor(name: String) : this(name, 0) {
//        // Secondary constructor body
//        println("Secondary constructor called")
//    }
//
//    // Function to print person details
//    fun printDetails() {
//        println("Name: $name, Age: $age")
//    }
//}
//
//fun main() {
//    // Creating objects using primary and secondary constructors
//    val person1 = Person("Alice", 30)
//    val person2 = Person("Bob")
//
//    // Printing details of both persons
//    person1.printDetails()
//    person2.printDetails()
//}
class Product(val name: String, val price : Double){
    fun displayDetails(){
        println("Name of product : ${name}  and it's prce is ${price}")
    }
}
class ShoppingCart(){
    private val items = mutableListOf<Product>()
    fun addItems(product : Product){
        items.add(product)
    }
    fun displayCart(){
        println("Cart : ")
        items.forEach{ it.displayDetails()}
    }
}

fun main(){
    val product1 = Product("notebook",100.00)
    val product2 = Product("tableCloth",1060.00)

    val `shopping-cart` = ShoppingCart()

    `shopping-cart`.addItems(product1)
    `shopping-cart`.addItems(product2)

    `shopping-cart`.displayCart()

}














































































