enum class Gender {
    MALE,
    FEMALE,
    DIVERSE;

    fun fromString(string: String): Gender {
        return Gender.values().firstOrNull {it.name == string.uppercase()} ?: DIVERSE
    }
}

class Guest(
    val name: String,
    private val age: Int,
    private val gender: String
) {
    fun isOfLegalAge(): Boolean {
        return age >= 18
    }

    fun isNotMale(): Boolean {
        return gender != "MALE"
    }
}