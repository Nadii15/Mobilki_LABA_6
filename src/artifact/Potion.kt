package artifact

class Potion(
    name : String,
    power : Int,
    rarity : String,
    val effectDuration : Int,
    val isConsumable : Boolean
)  : MagicItem(name, power, rarity) {
    override fun describe() {
        println("EffectDuration - $effectDuration")
    }

    override fun use() : String {
        return  if ( isConsumable ) "Одноразовое" else "Многоразовый"
    }
}