package test

import main.scala.ListManipulator
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class ListManipulatorSpec extends FlatSpec with ShouldMatchers {

  "ListManipulator" should "be able to sort the numbers in a list, low to high" in {

    val someList = List(2, 6, 1, 4, 2, 7, 8, 1, 4, 3)

    val listManipulator = new ListManipulator(someList)

    val expectedList = List(1, 1, 2, 2, 3, 4, 4, 6, 7, 8)

    listManipulator.sortLowToHigh should equal(expectedList)
  }

}