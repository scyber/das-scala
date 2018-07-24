//package example

object PrintArgs {

  def main(args: Array[String]):Unit = {
    //args.foreach(println)

    //for( arg<-args)
    //  println(arg)
    println(formatArgs(args))

  }
  def formatArgs(args: Array[String]) = args.mkString("\n")
}
