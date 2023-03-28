programa {
  funcao inicio() {

    real n1, n2, n3, n4, media
    cadeia nomeAluno, disciplina

    escreva("### CÁLCULO DE MÉDIA ###\n")
    escreva("Digite o nome do aluno:\n")
    leia(nomeAluno)

    escreva("Digite o nome da disciplina:\n")
    leia(disciplina)

    escreva("Digite a nota do 1º bimestre:\n")
    leia(n1)

    escreva("Digite a nota do 2º bimestre:\n")
    leia(n2)

    escreva("Digite a nota do 3º bimestre:\n")
    leia(n3)

    escreva("Digite a nota do 4º bimestre:\n")
    leia(n4)

    media = (n1 + n2 + n3 + n4) / 4.0

    se(media > 70.0)
      escreva("Prezado, " + nomeAluno + "sua média final é " + media + " e você foi aprovado na disciplina " + disciplina)
    senao
      escreva("Prezado, " + nomeAluno + "sua média final é " + media + " e você foi reprovado na disciplina " + disciplina)
  }
}
