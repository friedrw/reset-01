package temadecasaaula01;

public class Guerreiro {
    String nome;
    double vida;
    int ataque;
    int defesa;

    Guerreiro(String nome, int vida, int ataque, int defesa) {
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

    public double atacar(Guerreiro alvo, Armas armaDoGuerreiro ) {
        double ataqueTotal = this.ataque * armaDoGuerreiro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Barbaro alvo, Armas armaDoGuerreiro ) {
        double ataqueTotal = this.ataque * armaDoGuerreiro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Mago alvo, Armas armaDoGuerreiro ) {
        double ataqueTotal = this.ataque * armaDoGuerreiro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Feiticeiro alvo, Armas armaDoGuerreiro ) {
        double ataqueTotal = this.ataque * armaDoGuerreiro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Druida alvo, Armas armaDoGuerreiro ) {
        double ataqueTotal = this.ataque * armaDoGuerreiro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
    public double atacar(Clerigo alvo, Armas armaDoGuerreiro ) {
        double ataqueTotal = this.ataque * armaDoGuerreiro.poderDeAtaque - alvo.defesa;
        alvo.receberDano(ataqueTotal);
        return ataqueTotal;
    }
}
