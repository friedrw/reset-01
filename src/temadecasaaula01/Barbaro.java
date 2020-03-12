package temadecasaaula01;

public class Barbaro {
    String nome;
    double vida;
    int ataque;
    int defesa;

    Barbaro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public void receberDano(double danoRecebido) {
        double vidaRestante = this.vida - danoRecebido;
        this.vida = vidaRestante;
    }

    //public void gastarMana(double gastoDeMana;

    public double atacar(Guerreiro alvo, Armas armaDoBarbaro ) {
        double ataqueTotal = this.ataque * armaDoBarbaro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Barbaro alvo, Armas armaDoBarbaro ) {
        double ataqueTotal = this.ataque * armaDoBarbaro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Mago alvo, Armas armaDoBarbaro ) {
        double ataqueTotal = this.ataque * armaDoBarbaro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Feiticeiro alvo, Armas armaDoBarbaro ) {
        double ataqueTotal = this.ataque * armaDoBarbaro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Druida alvo, Armas armaDoBarbaro ) {
        double ataqueTotal = this.ataque * armaDoBarbaro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Clerigo alvo, Armas armaDoBarbaro ) {
        double ataqueTotal = this.ataque * armaDoBarbaro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
}
