package part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //Tail Recursion
    }

    factHelper(n, 1)

  }

  println(anotherFactorial(43))

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)
  }

  println(concatenateTailrec("Luis ", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(4))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8))
}
