val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

greetStrings.foreach((msg: String) => {
  println(msg)
})
