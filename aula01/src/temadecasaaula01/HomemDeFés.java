package temadecasaaula01;

import java.util.List;

public class HomemDeFés extends Personagem {
    int fe;

    public HomemDeFés(String nome, int vida, int ataque, int defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public HomemDeFés() {
    }

    void imprimirStatus() {
        System.out.println(this.nome + " tem " + this.vida + " de vida e " + this.fe + " de fé.");
    }

    void lançarPoder(Personagem alvo, PoderDivino poderdivino) {
        if (this.vida > 0 & this.fe >= poderdivino.custoDeFe) {
            double dano = calcularDano(alvo.defesa, poderdivino.intensidade);
            alvo.vida -= dano;
            this.fe -= poderdivino.custoDeFe;
            registrar(alvo.nome, poderdivino.nome, dano);
            if (alvo.vida <= 0) {
                registrarMorte();
            }
        }
    }
    void lançarPoderDeArea(List<Personagem> alvos, PoderDivino poderDivino) {
        for (int i = 0; i < alvos.size(); i++) {
            Personagem personagem = alvos.get(i);
            this.lançarPoder(personagem,poderDivino);
        }

    }
}
