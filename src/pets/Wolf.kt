package pets

class Wolf(name : String) : Pet(name = name, speed = 100, maxHandle = 250) {
    val packSize : Int = 5
    override fun makeSound() {
        println("$name воет.")
    }
    override fun describe() {
        println("Name - $name")
        println("maxHealth - $maxHandle")
        println("Speed - $speed")
        println("$name Стая - ${packSize}")
    }
}