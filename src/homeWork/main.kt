package homeWork

fun main() {
    val i = Item("Меч", "Оружие", 1000)
    val i1 = Item("Щит", "Броня")
    i.printInfo()
    i1.printInfo()

    val l = Location("Лес")
    val l1 = Location("Ад", "Высокий", 50)
    if (l.isDangerous()) {
        println("Локация сложная? Да")
    }
    else {
        println("Локация сложная? Нет")

    }
    if (l1.isDangerous()) {
        println("Локация сложная? Да")
    }
    else {
        println("Локация сложная? Нет")

    }
}
