programa {
  funcao inicio() {
    
    inteiro num
    escreva("### COMPARANDO UM N�MERO DIGITADO COM O N�MERO 10 ###\n")
    escreva("Digite um n�mero: ")
    leia(num)

    se(num == 0)
      escreva("O n�mero " + num + " � exatamente o zero")
    senao se(num == 10)
      escreva("O n�mero � exatamente 10")
    senao se(num > 10)
      escreva("O n�mero " + num + " � maior do que 10")
    senao se(num < 10 e num > 0 )
      escreva("O n�mero " + num + " � menor do que 10") 
    senao escreva("O n�mero � negativo")
  }
}
