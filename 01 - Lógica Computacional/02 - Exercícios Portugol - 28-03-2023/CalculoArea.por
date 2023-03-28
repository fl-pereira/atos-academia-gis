programa {

  inclua biblioteca Matematica --> math

  funcao inicio() {

    real x, y, valor    

    escreva("### CALCULAR VALOR DO TERRENO POR M²\n")
    escreva("Insira a metragem do lado X:\n")
    leia(x)
    escreva("Insira a metragem do lado Y:\n")
    leia(y)
    escreva("Insira o valor do M²:\n")
    leia(valor)

    escreva(calcularArea(x, y, valor))

  }

  funcao calcularArea(real x, real y, real valor) {
    real area = x * y
    real valorTotal = math.arredondar(area * valor, 2)
    retorne ("O valor do terreno com metragem de " + area + " M² é de R$ " + valorTotal)
  }
}
