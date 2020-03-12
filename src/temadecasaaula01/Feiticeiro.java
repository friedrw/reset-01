package temadecasaaula01;

public class Feiticeiro {
    String nome;
    double vida;
    int ataque;
    int defesa;
    double mana;

    Feiticeiro(String nome, int vida, int ataque, int defesa, int mana) {
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

    public double atacar(Guerreiro alvo, Magias magiaDoFeiticeiro) {
        double ataqueTotal = this.ataque * magiaDoFeiticeiro.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoFeiticeiro.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Barbaro alvo, Magias magiaDoFeiticeiro) {
        double ataqueTotal = this.ataque * magiaDoFeiticeiro.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoFeiticeiro.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Mago alvo, Magias magiaDoFeiticeiro) {
        double ataqueTotal = this.ataque * magiaDoFeiticeiro.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoFeiticeiro.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Feiticeiro alvo, Magias magiaDoFeiticeiro) {
        double ataqueTotal = this.ataque * magiaDoFeiticeiro.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoFeiticeiro.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Druida alvo, Magias magiaDoFeiticeiro) {
        double ataqueTotal = this.ataque * magiaDoFeiticeiro.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoFeiticeiro.custoDeMana);
        return ataqueTotal;
    }
    public double atacar(Clerigo alvo, Magias magiaDoFeiticeiro) {
        double ataqueTotal = this.ataque * magiaDoFeiticeiro.poder - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        this.gastarMana(magiaDoFeiticeiro.custoDeMana);
        return ataqueTotal;
    }
}
