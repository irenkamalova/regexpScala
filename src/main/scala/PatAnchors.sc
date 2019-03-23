import RegexPrinter.allMatch

// Anchors

// ЯКОРЯ: ^ - ведет себя уже не так, как внутри
// уже вовсе не исключающий симовл
// наоборот - принесет, если начало строки с этого символа
// ^ - начало строки:
//  Inside the FindAllIn or FindFirstIn, this type of anchoring is just ignored.

println(allMatch("[0-9]+".r,
"1231ad\nfd123sf")) // находит все последовательности

println(allMatch("^[0-9]+".r,
  "1231ad\nfd123sf")) // находит только ту, с которой началась строка


println(allMatch("/[a-z]+".r,
  "catalog/path/dot\ncatalog/path/dot/com"))

// $ - говорит, что на этом месте должна заканчивать строка
println(allMatch("""(?m)/[a-z]+$""".r,
  "catalog/path/dot\ncatalog/path/dot/com"))
// без (?m) принесет конец от всей строки
// не ясно, как включить multiline (?s) - не работает


// \b - якорь "граница слова"
println(allMatch("orange".r,
  "apple orangep peache    orangep orange."))
// ? хороший пример?

// \B - якорь "не граница слова"
println(allMatch("p\b".r,
  "apple orangep peache   p orangep orange. p"))
// ? хороший пример?
/*
Для режима multiline
можно включать \A - начало текста (не каждой строки, как ^)
               \Z - конец текста (не каждой строки, как $)
 */