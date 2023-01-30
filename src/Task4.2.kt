import java.lang.Exception
import kotlin.math.abs

fun main()
{
    try {
    val number = readln().toInt()
    if (abs(number) >99 || abs(number)<10)
    println("Число не двузначное")
    else
    {
    val firstDigit = number/10
    val secondDigit = number%10
    if (firstDigit%3==0 || (secondDigit%3==0 && secondDigit!=0))
        println("Содержит 3 или 6 или 9")
    else  println("Не содержит 3 или 6 или 9")
    }}
    catch (e: Exception)
    {
        println("Формат ввода неверный")
    }
}