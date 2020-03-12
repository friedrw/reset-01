package exercicio03;

public class Aluno {
    String nome;
    double notas;

    Aluno(String nome, double notas) {
        this.nome = nome;
        this.notas = notas;
    }
    boolean maiorOuIgual () {
        return this.notas >= 7.0;
    }
}
