package pets

open class Pet(val speed: Int ,
               val maxHandle: Int ,
               val name: String
) {
    open fun describe(){
        println("Питомец:$name,Здоровье: $maxHandle,Скорость:$speed ")
    }
    open fun makeSound(){
        println("$name Подаёт голос.")
    }
}