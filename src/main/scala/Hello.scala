/**
 * Created by wujin on 5/5/14.
 */
class Hello{
  def sayHi(name :String) = s"Hello $name!"
}


object Hello {
  def main(args: Array[String]) {
    val hello = new Hello
    println(hello.sayHi("scala"))
  }
}