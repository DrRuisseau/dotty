object Test {
  def main(args: Array[String]): Unit = {
    val arr: Array[String] = Array("foo")
    val lst = List("x", arr: _*) // error
    println(lst)
  }
}
