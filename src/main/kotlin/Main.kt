fun main() {
    println("Please Enter your name!")
    val hi: String = readln()
    println("Hello $hi!")
    println("Checking whether you are on the guestlist...")

    val guestList = listOf("Maria", "Blub")

    // introduce class person later on

    var isInvited: Boolean = false
    for (guest in guestList) {
        if (guest == hi) {
            isInvited = true
        }
    }

    if (!isInvited) { // or you can use !in
        println("You are not invited!")
        return
    }

    println("Welcome")

    println("How old are you?")

    val potentialAge = readln()
    val age = getAge(potentialAge)

    println("You are " + age + " old.") //println("You are $age old.")
    if (age < 18) {
        println("You are too young to enter!")
        return
    }

    println("Passed!")
}

private fun getAge(potentialAge: String): Int {
    while (true) {
        try {
            return potentialAge.toInt()
        } catch (e: NumberFormatException) {
            println("$potentialAge is no number. Try again with a valid number!")
        }
    }
}