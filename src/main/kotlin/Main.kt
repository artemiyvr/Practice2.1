fun main(args: Array<String>) {
    /*Задание 1, 2 и 3. Создал 2 константы: age1 и age2. Через Ctrl + Shift + P проверил,
    имеют ли они тип Int

    Создал константу avg1, ее значение - среднее арифметическое
    между age1 и age2.
    Оба значения age1 и age2 - целые числа, поэтому и результат будет целым

    Преобразовал age1 и age2 в тип Double, чтобы результат был более точным.
     */
    val age1:Double = 42.0;
    val age2:Double = 21.0;
    val avg1 = (age1 + age2) / 2;
    println(avg1);
    /*
    Задание 4. Создал строковые константы firstName и lastName
     */
    val firstName = "Артем"
    val lastName = "Врачинский"
    /*
    Задание 5. Создал константу fullName, и присвил ей значение firstName + lastName,
    разделенные пробелом
     */
    val fullName = firstName + " " + lastName;
    println(fullName)
    /*
    Задание 6. Создал константу myDetails, которой присвил нужное значение.
    Чтобы вставить другое значение в текст, использовал синтаксис $ перед нужным значением.
     */
    val myDetails = "Привет, меня зовут $fullName";
    println(myDetails)
    /*
    Задание 7. Создал констану date, которая содержит 3 значения: Месяц, день и год
     */
    val date = Triple (10, 2, 2006);
    /*
    Задание 8. Создал 3 константы, которым присвоил 3 значения из константы date
     */
    val month = date.first;
    val day = date.second;
    val year = date.third;
    /*
    Задание 10. Создал новую константу monthNew и присвоил ей новое значение.
    Создал константу PairNew и присвоил ей новую константу monthNew и старую константу year
     */
    val monthNew = month + 2;
    val pairNew: Pair <Int, Int> = Pair (monthNew, year);
    println(pairNew)
}