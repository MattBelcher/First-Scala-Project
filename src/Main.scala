object Main {

  def main(args: Array[String]) {
    val numbers = List(5, 4, 3, 2, 1)
    val listManipulator = new ListManipulator(numbers)

    println(listManipulator sortLowToHigh)

  }


}
