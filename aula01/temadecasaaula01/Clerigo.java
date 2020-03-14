package temadecasaaula01;

public class Clerigo {
    String nome;
    double vida;
    int ataque;
    int defesa;
    double fé;

    Clerigo(String nome, int vida, int ataque, int defesa, int fé) {
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

    public double atacar(Guerreiro alvo, PoderesDivinos poderDoClérigo) {
        double ataqueTotal = this.ataque * poderDoClérigo.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoClérigo.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Barbaro alvo, PoderesDivinos poderDoClérigo) {
        double ataqueTotal = this.ataque * poderDoClérigo.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoClérigo.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Mago alvo, PoderesDivinos poderDoClérigo) {
        double ataqueTotal = this.ataque * poderDoClérigo.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoClérigo.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Feiticeiro alvo, PoderesDivinos poderDoClérigo) {
        double ataqueTotal = this.ataque * poderDoClérigo.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoClérigo.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Druida alvo, PoderesDivinos poderDoClérigo) {
        double ataqueTotal = this.ataque * poderDoClérigo.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoClérigo.custoDeFé);
        return ataqueTotal;
    }
    public double atacar(Clerigo alvo, PoderesDivinos poderDoClérigo) {
        double ataqueTotal = this.ataque * poderDoClérigo.intensidade - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarFé(poderDoClérigo.custoDeFé);
        return ataqueTotal;
    }
}
