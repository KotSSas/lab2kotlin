import kotlin.math.*

/* Пример "главной функции программы
 * Сейчас она печатает сообщение Hello, World!
 */
fun main() {
    println("Hello, World!")
    var a:Int = 2
    var res = 3.7
    a = (a * res).toInt()
    println("Enter the x:")
    val x = readln().toDouble()
    println("Enter the a:")
    val a1 = readln().toDouble()
    println("Enter the b:")
    val b = readln().toDouble()

    println("Answer(S): "+"%6f".format(var5calcS(x,a1,b))+
            "\n"+ "Answer(Q): "+ "%6f".format(var5calcQ(x,a1,b)))
}

/* Пример написания функции, состоящей из одного выражения
 * В этом случае, указывать тип функции необязательно, Kotlin сам "выведет" его
 */
fun f(x:Double) = sin(x) + cos(x)



fun var5calcS(x:Double, a:Double, b: Double) : Double  =  a/sqrt(x+b) + x.pow(3) * (tan((x+b).pow(2)).pow(2))

fun var5calcQ(x: Double, a:Double, b:Double) : Double = (b*x.pow(2) - a )/ (E.pow(a*x) - 1)
