import scala.annotation.tailrec

object ListReverse {


  @tailrec
  //created method to reverse list
  //used tail recursion
  def ReverseList(arr: List[Int], revList: List[Int]): List[Int] = arr match {


    //tail recursion is used to reverse the input list
    case head :: tail => ReverseList(tail, head :: revList)


    //if the input List is empty then it will return the new list
    case Nil => revList
  }

  def main(args: Array[String]): Unit = {
    val numbers: List[Int] = List(99, 22, 6, 45, 44, 7, 3, 88)


    //function call to ReverseList
    println("Reversed:" + ReverseList(numbers, Nil))


  }
}