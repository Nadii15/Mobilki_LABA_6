package artifact

fun main() {
    val magics = listOf<MagicItem>  (
        Weapon("Жезл Пламени", 25, "Rare", "Огонь", true),
        Potion("Ядовитый настой", 20, "Uncommon", 15, false),
        Potion("Эликсир жизни", 40, "Rare", 20, true),
        Relic("Сердце Падшего", 150, "Legendary", "Тёмная магия", 6)
    )
    for (magic in magics) {
        magic.describe()
        println(magic.use())
    }
}