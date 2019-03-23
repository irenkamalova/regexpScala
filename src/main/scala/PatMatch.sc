import RegexPrinter.allMatch

def example {
  val pattern = "[Ss]cala".r // same: "(S|s)cala"
  val str = "Scala is scalable and cool"
  val result = pattern.findFirstIn(str)
  println(result)
  println(allMatch(pattern, str))
  println(pattern replaceFirstIn(str, "Java"))
}
// base 1: диапазоны
println(allMatch("[a-z][a-z]".r,
  "fdj dfdj dfhdj"))

println(allMatch("[a-z0-9][0-9]".r,
  "f90dj0 d8fd2j3 d3f7h8d10j"))

println(allMatch("[а-яё]".r,
  "красно-чёрное"))
println(allMatch("[а-яё]+".r,
  "красно-чёрное"))
println(allMatch("[а-яё-]+".r,
  "красно-чёрное"))
println(allMatch("[а-яё-]*".r,
  "красно-чёрное"))
// разное количество символов
println(allMatch("[0-9]{1,2}".r,
  "1 мая, 31 мая"))
// здесь не нужны экранируемые символы
println(allMatch("[а-яё]+ {0,1}[а-яё].{0,1} {0,1}[а-яё]{0,1}.{0,1}".r,
  """
    |иванов а п
    |пертров и. г.
    |смирнов ф. р
    |агент смитр
  """.stripMargin))
// вывести все теги из текста:
println(allMatch("</{0,1}[^+]>".r,
  """
    |<u>car</u>
    |<u>car fax</u>
    |<u>car peace</u>
    |<u>str</u>
  """.stripMargin))
// все символы кроме тегов:
println(allMatch("[^</>]+".r,
  """
    |<u>car</u>
    |<u>car fax</u>
    |<u>car peace</u>
    |<u>str</u>
  """.stripMargin))
// все внутри тегов с тегами:
println(allMatch("<[a-z]+>[^>]+>".r,
  """
    |<u>car</u>
    |<u>car fax</u>
    |<u>car peace</u>
    |<u>str</u>
  """.stripMargin))
