package com.example

import scala.collection.mutable.Map

object ChecksumAccumulator {

  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator()

      val cs = acc.checksum(s)
      cache += (s -> cs)
      cs
    }


}

class ChecksumAccumulator() {
  def checksum(s: String) : Int = {
    var sum :Int = 0
    for(c <- s.toCharArray) {
      sum += c.toByte;
    }
    sum
  }
}