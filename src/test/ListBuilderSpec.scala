package test

import main.scala.ListBuilder
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class ListBuilderSpec extends FlatSpec with ShouldMatchers {

  "ListBuilderSpec" should "be able to build a list of Ints from a comma seperated list of numbers (represented in String format)" in {

    var numbers = "11,4,1,7"
    var expectedList = List(11, 4, 1, 7)

    val listBuilder = new ListBuilder
    listBuilder.constructFrom(numbers) should equal(expectedList)
  }

}