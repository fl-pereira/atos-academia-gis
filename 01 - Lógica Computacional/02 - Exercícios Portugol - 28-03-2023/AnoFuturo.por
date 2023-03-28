programa {
  funcao inicio() {

    inteiro anoNasc, anoFuturo, resultado
    anoFuturo = 2035

    escreva("### QUANTOS ANOS VOCÊ TERÁ EM 2035? ###\n")
    escreva("Qual seu ano de nascimento?:\n")
    leia(anoNasc)
    escreva(calcularDiferencaAnos(anoFuturo, anoNasc))
  }

  funcao calcularDiferencaAnos(inteiro anoFuturo, inteiro anoNasc) {
    inteiro resultadoFinal = anoFuturo - anoNasc
    retorne ("Em " + anoFuturo + " você terá " + resultadoFinal + " anos, pois nasceu em " + anoNasc)
  }
}
