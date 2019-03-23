import RegexPrinter.allMatch
// Modifications

// (?m) - multiline
println(allMatch("(?m)/[a-z]+$".r,
  "catalog/path/dot\ncatalog/path/dot/com"))

// (?m) - multiline
println(allMatch("(?m)^catalog".r,
  "catalog/path/dot\ncatalog/path/dot/com"))
// без (?m) принесет только один catalog

// (?i) - ignoreCase, insensative
println(allMatch("(?i)abcd".r,
  "ABCD"))
// с (?i) принесет ABCD


// модификатор s - single line - захватывает символы
// переноса строки:
// до
println(allMatch(".".r,
  "a\nb"))
// после
println(allMatch("(?s).".r,
  "a\nb"))

// модификатор u - unicode - позволяет
// находить кириллические символы (но скала нам и так нашла)


// модификатор U - Ungreedy
// - делает модификторы нежадными

println(allMatch("<u>.*</u>".r,
  "раз <u>два</u> и <u>три</u>"))
// после - не получилось!!!
// надо добавить ? после .*
// подсказка нашлась здесь:
// http://php.net/manual/ru/reference.pcre.pattern.modifiers.php
println(allMatch("<u>.*?</u>".r,
  "раз <u>два</u> и <u>три</u>"))

// модификатор x - позволяет игнорировать спец символы в самом шаблоне
// модификатор A - работает как якорь ^ - шаблон валиден, только
// если с него начинается строка

// с модификатором D якорь конца строки $ не увидит переноса строки

// модификатор X - ругается, если после / идет не спец сивол
// println(allMatch("\y".r, - не валидно
// значит в скала он по умолчанию



