package mate.academy

fun greetUsers() {
    while (true) {
        fun getUserName(): String? {
            println("Please enter a name (or press Enter to quit):")
           return readLine()
        }

        val name = getUserName()

        if (name?.isEmpty() ?: true) break
        println("Hello $name!")
    }
}

fun main() {
    greetUsers()
}
