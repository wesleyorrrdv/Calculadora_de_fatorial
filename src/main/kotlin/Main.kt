fun main() {
    print("Digite um número inteiro nao negativo: ")

    val number = readLine()?.toIntOrNull()?:return
    if (number < 0){
        println("O numero deve ser não negativo.")
        return
    }
    var factorial = 1L
  for (i in 1..number) {
      factorial *= i
  }

    println("O fatorial de $number é $factorial")

    }