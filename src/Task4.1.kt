import java.lang.Exception

fun main()
{
    try {
    println("Введите ширину форточки")
    val width = readLine()!!.toDouble()
    println("Введите высоту форточки")
    val height = readLine()!!.toDouble()
    println("Введите диаметр головы")
    val head = readLine()!!.toDouble()
        if (head>0&&height>0&&width>0)
        {   if (head<height && head<width)
                println("Пролез")
            else println("Не пролез")
        }
        else println("Одна из длин отрицательна")
    }
    catch (e: Exception)
    {
        println("Формат ввода неверный")
    }
}