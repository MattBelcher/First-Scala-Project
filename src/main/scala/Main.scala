package main.scala

object Main {

  def main(args: Array[String]) {
    val userInputListString = args(0)
    val listBuilder = new ListBuilder
    var numbers = listBuilder.constructFrom(userInputListString)
    val listManipulator = new ListManipulator(numbers)

    println(listManipulator sortLowToHigh)

  }

}
