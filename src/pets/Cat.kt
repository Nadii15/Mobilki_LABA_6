package pets

class Cat(name : String) : Pet(name = name, speed = 80, maxHandle = 150){
    val stealthLevel : Int = 90

    override fun makeSound() {
        println("$name may")
    }

    override fun describe() {
        println("Name - $name")
        println("maxHealth - $maxHandle")
        println("Speed - $speed")
        println("$name скрытный. Скрытность - ${stealthLevel}")
    }
}