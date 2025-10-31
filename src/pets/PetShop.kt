package pets

fun main(){
//    val wolf = Wolf()
//    println(wolf.packSize)

    val pets = listOf<Pet>(
        Wolf("Фенрир"),
        Cat("Мурзик"),
        Eagle("Сквайвинд"),
        Bear("Балу")
    )
    for (pet in pets){
        pet.describe()
        pet.makeSound()
        println()
    }

}