package com.topgun.example

import com.topgun.example.model.abc.Foo

object Main {
  def main(args: Array[String]): Unit = {
    while (true) {
      val foo = new Foo()
      foo.methodA()
      foo.methodB(10)
    }
  }
}
