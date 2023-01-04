fun main(){

//println(date("12 JAN 2020"))
    html()

}

fun date(date: String) : Boolean //12 JAN 2020
{
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
    val regexp = """\d{2} $month \d{4} """ //?????
    return date.matches(regexp.toRegex())
}
fun find(){
    val line = "abc 123 def"
    val regexp = """.*\d{3}.*"""
    val pattern = regexp.toRegex()
    println(line.matches(pattern))
}

fun html() {
    val html = "<html><head>hello</head><h1>heading</h1><p>Greet!<br></html>"
    val regexp = """<[^>/]+>"""
    val found = regexp.toRegex().findAll(html)
    for (result in found) {
        println(result.value)
    }
}