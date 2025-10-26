package World

fun main() {
    val quest = Quest("Побег из замка", 5, 700, "Сложный")
    println("Квест сложный? ${quest.isHard()}")
}