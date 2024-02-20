//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("hello Mutesi")
    var w =modulus(num1 = 30, num2 = 8)
    println(w)
    var k =add(num1 = 23, num2 = 10)
    println(k)
    var s =add(num1 = 30, num2 = 7)
    println(s)
    aboutMyself(word = "Collaboration and teamwork are important to me because they help in problem-solving")



}
fun modulus(num1:Int,num2:Int):Int{
    var result=num1%num2
    return result
}
fun add(num1: Int,num2: Int):Int{
    var result =num1+num2
    return result

}
fun <string> aboutMyself(word:string){
    println(word)





}





