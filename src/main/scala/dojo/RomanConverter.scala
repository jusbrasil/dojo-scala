package dojo

object RomanConverter {
  val translateMap = Map('I'->1, 'V'->5, 'X'->10, 'L'->50, 'C'->100, 'D'->500, 'M'->1000)

  def fromRomanToLong(romanNumber: String): Long = {
    var total = 0
    var lastValue = 0

    for (c <- romanNumber.toUpperCase) {
      val current = translateMap(c)

      total += current
      if (lastValue < current) {
        total -= lastValue*2
      }

      lastValue = current
    }

    total
  }
}

