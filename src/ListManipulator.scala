class ListManipulator(aNumberList: List[Int]) {

  val numberList = aNumberList

  def sortLowToHigh = {

    numberList.sortWith(_ < _)
  }

}