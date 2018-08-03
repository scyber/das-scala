//package com.example

import scala.io.Source

object CountLinesExample {
  def widthOfLength(s: String) = {
    /*println(s)
    println(s.length)
    println(s.length.toString)
    println(s.length.toString.length)*/

    s.length.toString.length
  }
  def main(args: Array[String]): Unit = {

    if (args.length > 0) {

      var maxWidthLine = 0
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )
      //println(lines)
      for(line <- lines) {

        /*if (maxWidthLine < widthOfLength(line)) {
          println(line)
          println(maxWidthLine)
          maxWidthLine = widthOfLength(line)
        }*/
        val maxWidth = widthOfLength(longestLine)
        val numSpaces = maxWidth -  widthOfLength(line)
        maxWidthLine = maxWidthLine.max(widthOfLength(line))
        val padding = " " * numSpaces
        println(padding + line.length +" | "+ line)
        //println(line)
      }

      println(longestLine)
      println(maxWidthLine)
    }
    else
      Console.err.println("Please enter filename")




  }

}
