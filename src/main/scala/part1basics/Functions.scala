package part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Holi", 4))

  def aParameterlessFunction(): Int = 43

  println(aParameterlessFunction())

  def nombreFunction(name: String, age: Int) = {
    "My name is " + name + " and I am " + age + " years old"
  }

  println(nombreFunction("Luis", 24))

  def factorialFunction(n: Int): Int = {
    if (n == 1) n
    else n * factorialFunction(n - 1)
  }

  println(factorialFunction(4))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n:Int): Boolean = {
    def isPrimeUntil(number:Int): Boolean =
      if(number <= 1) true
      else n % number != 0 && isPrimeUntil(number-1)

    isPrimeUntil(n / 2) //se divide el parametro entre 2 y de ahi se pasa a la recursividad
  }
  println(isPrime(4))
}
