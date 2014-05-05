
/**
 * Created by wujin on 5/5/14.
 */
class HelloTest extends org.scalatest.FunSuite {
  test("test sayHi") {
    val hello = new Hello
    assert(hello.sayHi("scala") == "Hello scala!")
  }
}
