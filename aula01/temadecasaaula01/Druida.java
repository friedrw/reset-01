package temadecasaaula01;

public class Druida {
    String nome;
    double vida;
    int ataque;
    int defesa;
    double fé;

    Druida(String nome, int vida, int ataque, int defesa, int fé) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fé = fé;
    }
    public void receberDano(double danoRecebido) {
        double vidaRestante = this.vida - danoRecebido;
        this.vida = vidaRestante;
    }

    public void gastarFé(double gastoDeFé) {
        double féRestante = this.fé - gastoDeFé;
        this.fé = féRestante;
    }
    public double atacar(Guerreiro alvo, PoderesDivinos poderDoDruida) {
        double ataqueTotal = this.ataque * poderDoDruida.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoDruida.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Barbaro alvo, PoderesDivinos poderDoDruida) {
        double ataqueTotal = this.ataque * poderDoDruida.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoDruida.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Mago alvo, PoderesDivinos poderDoDruida) {
        double ataqueTotal = this.ataque * poderDoDruida.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoDruida.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Feiticeiro alvo, PoderesDivinos poderDoDruida) {
        double ataqueTotal = this.ataque * poderDoDruida.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoDruida.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Druida alvo, PoderesDivinos poderDoDruida) {
        double ataqueTotal = this.ataque * poderDoDruida.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoDruida.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Clerigo alvo, PoderesDivinos poderDoDruida) {
        double ataqueTotal = this.ataque * poderDoDruida.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoDruida.custoDeFé);
        return ataqueTotal;
    }
}
