package aula02exercicio01;

public class Submarino extends Maritimo {
    int profundidadeMaxima;

    Submarino (String nome, int velocidadeMaxima, int lotacaoMaxima, String combustivel, String terreno) {
        super(nome, velocidadeMaxima, lotacaoMaxima, combustivel, terreno);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public String toString() {
        return "Submarino{" +
                "profundidadeMaxima=" + profundidadeMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", terreno='" + terreno + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
