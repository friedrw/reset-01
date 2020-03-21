package exercicio3;

public class Item {
    String nome;
    Segmento segmento;
    double valor;
    int quantidade;

    public Item(String nome, Segmento segmento, double valor, int quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "[" +segmento+"] - "+nome+" ("+quantidade+") - "+valor + " | ";// + ;//VALOR TOTALquantidade +;
    }
}
