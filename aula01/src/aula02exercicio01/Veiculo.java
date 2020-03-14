package aula02exercicio01;

public class Veiculo {
    String nome;
    int velocidadeMaxima;
    int lotacaoMaxima;
    String combustivel;
    String terreno;

    Veiculo (String nome, int velocidadeMaxima, int lotacaoMaxima, String combustivel, String terreno){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.lotacaoMaxima = lotacaoMaxima;
        this.combustivel = combustivel;
        this.terreno = terreno;
    }
}
