fun main(args: Array<String>) {
    println("Hello World!")

    var a = 1
    var b = 1
    var c = sum(a, b)
    var d:String? = null;
    var length: Int

    length
    println("sum(${a}, ${b}) = ${c}")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}