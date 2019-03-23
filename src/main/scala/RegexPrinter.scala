import scala.util.matching.Regex

object RegexPrinter {

  def allMatch(pattern: Regex,
               text: String): String = {
    pattern.findAllIn(text).mkString(",")
  }
}
