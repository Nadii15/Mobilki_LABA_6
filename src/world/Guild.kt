package world

fun main(){
    val quest = Quest("Поиск артифакта",3 ,800,"Средний")
    val contract = Contract("Защита каравана","Гильдия купцов","Охрана груза",1200)
    val specialOp = SpecialOperation("Операция 'Тень' ", 2500,2,true)

    println ("Информация о квесте: ")
    println("Название: ${quest.title},Награда:${quest.reward}")

    println("\nИнформация о контракте: ")
    println("Название: ${contract.title}, Заказчи: ${contract.clientName}")

    println("\nИнформация о спецоперации: ")
    println("Название: ${specialOp.title}")
    specialOp.showReward()
        val missions = listOf<Mission>(
        Quest(title = "Охота на монстров", duration = 3, reward = 600, difficulty = "Средний"),
        SpecialOperation(title = "Ночной рейд", reward = 1500, requiredClearance = 2,
            isCovert = true),
        Contract(title = "Сопровождение каравана", clientName = "Гильдия Торговцев",
            taskDescription = "Доставить груз через лес", reward = 800, isUrgent = true)
    )

    for (mission in missions) {
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }
}