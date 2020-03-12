package exercicio03;

public class SituacaoAlunos {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joãozinho", 4.3);
        Aluno aluno2 = new Aluno("Pedrinho", 8.8);
        Aluno aluno3 = new Aluno("Juquinha", 7.5);

        System.out.println("O aluno " + aluno1.nome + ", com nota " + aluno1.notas + ", está aprovado? " + aluno1.maiorOuIgual());
        System.out.println("O aluno " + aluno2.nome + ", com nota " + aluno2.notas + ", está aprovado? " + aluno2.maiorOuIgual());
        System.out.println("O aluno " + aluno3.nome + ", com nota " + aluno3.notas + ", está aprovado? " + aluno3.maiorOuIgual());
  }
}
