object Main extends Test with App {
    println(test)
}

trait Test {
  lazy val test: String = "This working?"
}
