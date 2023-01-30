import kotlin.math.pow

fun main()
{
    while (true)
    try
    {
        var firstNumber = readln().toDouble()
        var secondNumber = readln().toDouble()

        if (firstNumber==secondNumber)
        {
            println(firstNumber.pow(3))
        }
        else
            if (firstNumber>secondNumber)
            {
                firstNumber+=1
                println(firstNumber)
            }
            else
            {
                secondNumber+=1
                println(secondNumber)
            }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный формат ввода")
    }
}