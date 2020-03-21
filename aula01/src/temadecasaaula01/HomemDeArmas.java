package temadecasaaula01;

public class HomemDeArmas extends Personagem {
    public HomemDeArmas(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }


    public HomemDeArmas() {
    }

    void imprimirStatus() {
        System.out.println(this.nome + " tem " + this.vida + " de vida.");
    }

    void equiparArma(Arma arma){
            System.out.println(this.nome+" equipou "+arma.nome+".");
    }

    void atacar(Personagem alvo, Arma arma) {
        if (vida > 0) {
            double dano = calcularDano(alvo.defesa, arma.poderDeAtaque);
            alvo.vida -= dano;
            registrar(alvo.nome, arma.nome, dano);
            if (alvo.vida <= 0) {
                registrarMorte();
            }
        }
    }
}
