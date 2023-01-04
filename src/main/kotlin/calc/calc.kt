package calc

fun Any.print():String = when(this){
    is Int ->"Int: ${this.toString()}"
    else -> "Don't know: ${this.toString()}"
}
fun main(){
    val any = "123"
    println(123.print())

    val long:Long = 212
    val int:Int = long.toInt()
    val int1:Int = "123".toInt()
}