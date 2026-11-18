object StringProcessor {
  def processStrings(strings: List[String]): List[String] = { 
    //Убрал переменную var result.
    //Убрал цикл for
    //Убрал условный оператор if
    //Встроил функциональный конвейер:
    //  1) strings.filter отбирает строки длиной больше 3 символов.
    //  2) .map преобразует каждую оставшуюся строку в верхний регистр.
    strings.filter(str => str.length > 3).map(str => str.toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}