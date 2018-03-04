import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>){
    val sample1: Byte = 0x3A
    var sample2: Byte = 58
    var heartRate: Int = 85
    var deposits: Double = 135002796.0
    val acceleration: Float = 9.800f
    var mass: Float = 14.6f
    var distance: Double = 129.763001
    var lost: Boolean = true
    var expensive: Boolean = true
    var choice: Int = 2
    val integral: Char = '\u222B'
    val greeting: String = "Hello"
    var name: String = "Karen"

    if (sample1.equals(sample2))
        println("The samples are equal.")
    else
        println("The samples are not equal.")

    if (heartRate in 40..80)
        println("Heart rate is normal.")
    else
        println("Heart rate is not normal.")

    if (deposits >= 100000000)
        println("You are exceedingly wealthy.")
    else
        println("Sorry you are so poor.")

    var force = mass.times(acceleration)
    println("force = $force.")

    println("$distance is the distance.")

    if (lost && expensive)
        println("I am really sorry! I will get the manager.")
    else if (lost && !expensive)
        println("Here is coupon for 10% off.")

    when (choice){
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made an unknown choice.")
    }

    println("$integral is an integral.")

    for(i in 5..10)
        println("i = $i")

    var age: Int = 0

    while(age < 6){
        println("age = $age")
        age++
    }

    println("$greeting $name")






}