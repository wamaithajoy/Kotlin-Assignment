fun main(){
    var name="AkiraChix"
    var y=name[0].toString()+name[2]+name[3]
    println(y)
    var a=statement("Jay",23)
    println(a)
    var z=text("Tekashi")
    println(z.count())
    var x=Identity("Joy")



}

fun statement(x: String, y: Int ): String{
    var sentence=("Hi my name is $x and i am $y years old")
    return sentence
}
fun text(name: String): String{
    var name="Tekashi"
    return name
}
fun Identity(name: String){
    if (name== "Joy")
        println("That's me")
    else
        println("i don't know who that is")

}

