package temadecasaaula01;

public class Mago {
    String nome;
    double vida;
    int ataque;
    int defesa;
    double mana;

    Mago(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }
    public void receberDano(double danoRecebido) {
        double vidaRestante = this.vida - danoRecebido;
        this.vida = vidaRestante;
    }

    public void gastarMana(double gastoDeMana) {
        double manaRestante = this.mana - gastoDeMana;
        this.mana = manaRestante;
    }

    public double atacar(Guerreiro alvo, Magias magiaDoMago) {
        double ataqueTotal = this.ataque * magiaDoMago.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoMago.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Barbaro alvo, Magias magiaDoMago) {
        double ataqueTotal = this.ataque * magiaDoMago.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoMago.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Mago alvo, Magias magiaDoMago) {
        double ataqueTotal = this.ataque * magiaDoMago.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoMago.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Feiticeiro alvo, Magias magiaDoMago) {
        double ataqueTotal = this.ataque * magiaDoMago.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoMago.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Druida alvo, Magias magiaDoMago) {
        double ataqueTotal = this.ataque * magiaDoMago.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoMago.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Clerigo alvo, Magias magiaDoMago) {
        double ataqueTotal = this.ataque * magiaDoMago.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoMago.custoDeMana);
        return ataqueTotal;
    }
}
