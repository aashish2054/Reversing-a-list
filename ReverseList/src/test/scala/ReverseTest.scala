import org.scalatest.flatspec.AnyFlatSpec
class ReverseTest extends  AnyFlatSpec{
  val reverse=new Reverse
  "Reverse" should "return empty list" in {
    val result = reverse.reverseList(List())
    assertResult(List())(result)
  }
  it should "reverse the list" in {
    val result= reverse.reverseList(List(1,2,3,4,5))
    assertResult(List(5,4,3,2,1))(result)
  }
}
