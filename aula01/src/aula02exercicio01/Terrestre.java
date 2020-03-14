package aula02exercicio01;

public class Terrestre extends Veiculo {
    int numeroRodas;

    Terrestre (String nome, int velocidadeMaxima, int lotacaoMaxima, String combustivel, String terreno, int numeroRodas) {
        super (nome, velocidadeMaxima, lotacaoMaxima,combustivel,terreno);
        this.numeroRodas = numeroRodas;
    }
}
