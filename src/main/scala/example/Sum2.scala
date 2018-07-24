package example

object Sum2 extends App{


  def Sum(f:Int => Int)(a:Int, b:Int):Int ={

      def loop(a:Int, acc:Int): Int ={
          if( a > b) acc
          else loop(a+1,f(a) + acc)
      }
      loop(a,1)
  }
  //Sum( x=> x * x ,3,5)
}
