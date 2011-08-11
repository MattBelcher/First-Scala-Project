package main.scala

import java.util.ArrayList

class ListBuilder {

  def constructFrom(numbers: String) = {
    var numbersWithoutCommas = numbers.split(",")
    var numbersAsInts = new ArrayList[Int]()
    numbersWithoutCommas.foreach(it => numbersAsInts.add(Integer.parseInt(it)))

    numbersAsInts.toArray.toList.asInstanceOf[List[Int]]
  }

}