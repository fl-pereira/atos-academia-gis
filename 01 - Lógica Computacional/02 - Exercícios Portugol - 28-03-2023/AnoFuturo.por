programa {
  funcao inicio() {

    inteiro anoNasc, anoFuturo, resultado
    anoFuturo = 2035

    escreva("### QUANTOS ANOS VOC� TER� EM 2035? ###\n")
    escreva("Qual seu ano de nascimento?:\n")
    leia(anoNasc)
    escreva(calcularDiferencaAnos(anoFuturo, anoNasc))
  }

  funcao calcularDiferencaAnos(inteiro anoFuturo, inteiro anoNasc) {
    inteiro resultadoFinal = anoFuturo - anoNasc
    retorne ("Em " + anoFuturo + " voc� ter� " + resultadoFinal + " anos, pois nasceu em " + anoNasc)
  }
}
