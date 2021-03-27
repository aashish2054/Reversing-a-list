class Reverse {
  def reverseList(inputListToReverse: List[Int]): List[Int] = {
    if (inputListToReverse == List()) {   // If the input list is empty, it will return it.
      inputListToReverse
    }
    else {
      // recursively calling reverseList method on the tail
      reverseList(inputListToReverse.tail) :+ inputListToReverse.head
    }
  }
}
