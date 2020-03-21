package temadecasaaula01;

import java.util.List;

public class HomemDeMagias extends Personagem {
    int mana;

    public HomemDeMagias(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public HomemDeMagias() {
    }

    void imprimirStatus() {
        System.out.println(this.nome + " tem " + this.vida + " de vida e " + this.mana + " de mana.");
    }

    void lançarMagia(Personagem alvo, Magia magia) {
        if (this.vida > 0 & this.mana >= magia.custoDeMana) {
            double dano = calcularDano(alvo.defesa, magia.poder);
            alvo.vida -= dano;
            this.mana -= magia.custoDeMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <= 0) {
                registrarMorte();
            }
        }
    }

    void lançarMagiaDeArea(List<Personagem> alvos, Magia magia) {
        for (int i = 0; i < alvos.size(); i++) { //for{Personagem alvo : alvos{
            Personagem personagem = alvos.get(i); //this.lançarMagia(alvo,magia)
            this.lançarMagia(personagem,magia);
        }

    }
}
