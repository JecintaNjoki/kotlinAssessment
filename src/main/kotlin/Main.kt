fun main(){
println( chair("stool","bunkbed"))
    println(arrayofints())
   var calc=Caculator("adds","subtracts","divides","multiplies")
    stringsArray()
    edu()
    calc.addition
    calc.substraction
    calc.division
    calc.multiplication
}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun chair(chair1: String, chair2:String):String {
    var chair = "stool,bunkbed"
    chair.
    return chair

}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun arrayofints(numbers:Int):Int {
    var numbers = arrayOf(17, 28, 12, 36, 56, 34, 12, 78)
    var min =numbers
    var max = numbers
    var av = numbers
    return numbers

}
    //Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3 pts)
fun edu(){
var x="Education"
     println(x)

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun stringsArray(){
var y= arrayOf("delay","accelerate","start")
    println(y)
}
    //Create a calculator class that is capable of the following functions:
   // (i) Addition of any 2 numbers
          //  (ii) Subtraction between any 2 numbers
          //  (iii) Accurate division between any 2 numbers
    //(iv) Multiplication of any 2 numbers
           // Instantiate your calculator object and invoke all its functions
class Caculator( var addition:String,var substraction:String,var division:String,var multiplication:String)