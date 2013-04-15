package dojo

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestSuite extends FunSuite {
  test("I should be equals to 1") {
    assert(RomanConverter.fromRomanToLong("I") == 1l)
  }
  test("two chars together should make a sum") {
    assert(RomanConverter.fromRomanToLong("II") == 2l)
  }

  test("IX should be equals to 9") {
    assert(RomanConverter.fromRomanToLong("IX") == 9l)
  }

  test("XV should be equals to 15") {
    assert(RomanConverter.fromRomanToLong("XV") == 15l)
  }

  test("XIV should be equals to 14") {
    assert(RomanConverter.fromRomanToLong("XIV") == 14l)
  }

  test("CMXCIX should be equals to 999") {
    assert(RomanConverter.fromRomanToLong("CMXCIX") == 999l)
  }
  test("MCMLXXI should be equals to 1971") {
    assert(RomanConverter.fromRomanToLong("MCMLXXI") == 1971l)
  }
  test("m should be equals to 1000") {
    assert(RomanConverter.fromRomanToLong("m") == 1000l)
  }
  test("MMMDCCCLXXXVIII should be equals to 3888") {
    assert(RomanConverter.fromRomanToLong("MMMDCCCLXXXVIII") == 3888l)
  }


}
