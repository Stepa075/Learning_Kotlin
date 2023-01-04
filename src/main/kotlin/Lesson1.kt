fun main(args : Array<String>){
    println("Hello World!")
    val temp = 30
    val cond = when {
        temp< -5 -> "cool"
        temp<5 -> "awer 0"
        else -> "wery hot"
         }
    val name = "Alex"
    var age = 39

    println("name $name age ${age+1} ")
    println("""one line
        |two line 
        |three line
    """.trimMargin())
    val pair  = Pair("one", "two")
    println("first: ${pair.first} second: ${pair.second}")
    val(a,b,c) = Triple(32, "max", listOf(1,2,3))

}