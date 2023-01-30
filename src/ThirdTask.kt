fun main()
{
    while(true)
    try {
    when (readln().toInt())
    {
        in Int.MIN_VALUE..0->println("Отрицательный возраст")
        in 0..2-> println("Младенец")
        in 2..14->println("Ребенок")
        in 14..18->println("Подросток")
        in 18..35->println("Молодой")
        in 35..60->println("Взрослый")
        in 60..100->println("Пенсионер")
        else->println("Too much")
    }}
    catch (e: Exception)
    {
        println("Неверный формат ввода")
    }
}