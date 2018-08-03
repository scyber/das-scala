import java.io.File

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    //println(a)
    a = b % a
    //println(a)
    b = temp
  }
  b
}
def gcd(a: Int, b: Int): Int = {
  if (b == 0) a else gcd(b, a % b)
}
def greet() = { println("hi") }

//greet()
//gcdLoop(12,0)

val filesHere = (new File(("."))).listFiles()
//for (file <- filesHere)
//  println(file)


