package com.topgun.example.model.abc

class Foo {
  def methodA()={
    val x = List.range(-100,100, 1)
    val y = List.range(-100,100, 1)
    val z = List(x,y)
    z.map(l=>{l.map(_*100)}).map(l=>{l.map( x => x*Math.exp(x))}).foreach(l=>{l.foreach(println)})
    z.map(
      l=>{
        l.map(_*100)
      }).map(
      l=>{
        l.map(
          x => x*Math.exp(x)
        )})
      .foreach(
        l=>{
          l.foreach(println)
        })
    val bar = new Bar()
    bar.methodA()
  }
  def methodB(x:Int): Unit ={
    if(x == 0) return 0
    methodB(x-1)
  }
}
