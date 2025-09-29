package mate.academy

fun greetUsers() {
    var name: String? = null
    while (readLine().also { name = it }?.isNotBlank() == true) {
        println("Hello $name")
    }

}

fun readLine(): String? {
    println("Please enter a name (or press Enter to quit): ")
    return kotlin.io.readLine();
}

fun main() {
    greetUsers()
}
