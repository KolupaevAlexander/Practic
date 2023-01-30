fun main()
{
    try
    {
        val x = readln().toDouble()
        if (x <= 1) println(0)
        else println(1 / (x + 6))
    }
    catch (e: Exception)
    {
        println("Неверный ввод")
    }
}