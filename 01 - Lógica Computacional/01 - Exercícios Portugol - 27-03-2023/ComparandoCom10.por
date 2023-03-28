programa {
  funcao inicio() {
    
    inteiro num
    escreva("### COMPARANDO UM NÚMERO DIGITADO COM O NÚMERO 10 ###\n")
    escreva("Digite um número: ")
    leia(num)

    se(num == 0)
      escreva("O número " + num + " é exatamente o zero")
    senao se(num == 10)
      escreva("O número é exatamente 10")
    senao se(num > 10)
      escreva("O número " + num + " é maior do que 10")
    senao se(num < 10 e num > 0 )
      escreva("O número " + num + " é menor do que 10") 
    senao escreva("O número é negativo")
  }
}
