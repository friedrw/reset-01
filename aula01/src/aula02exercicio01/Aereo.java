package aula02exercicio01;

public class Aereo extends Veiculo {
    int altitudeMaxima;
    int numeroRodas;

    Aereo (String nome, int velocidadeMaxima, int lotacaoMaxima, String combustivel, String terreno, int altitudeMaxima, int numeroRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima, combustivel, terreno);
        this.numeroRodas = numeroRodas;
        this.altitudeMaxima = altitudeMaxima;

    }
}
