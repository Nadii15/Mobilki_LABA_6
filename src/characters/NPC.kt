package characters

import world.Quest

class NPC (
    name: String,
    hp:Int = 0,
    element:String = "Неизвестный",
    val faction:String = "Городские жители",
    val hasQuest: Boolean = false
) : GameCharacter(name,hp,element){
    fun giveQuest() : String {
        return  if (hasQuest) {
            "$name предлогает вам квест"
        } else {
            "$name не имеет заданий для вас"
        }
    }
    fun trade() {
        println("$name открыл торговлю")
    }
}