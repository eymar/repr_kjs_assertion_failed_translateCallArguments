class SomeDat1a(var value: String)

inline fun <T> myremember(calculation: () -> T): T {
    return calculation()
}

inline fun InlineFoo(content: () -> Unit) {
    content()
}

fun Game() = InlineFoo {
    val message = SomeDat1a("a")

    val onWin = myremember {
        fun f() { message.value = "You win!"}
        ::f
    }

    val difficulty = object {}
}

fun main() {
    Game()
}

