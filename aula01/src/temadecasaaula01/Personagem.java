package temadecasaaula01;

public class Personagem {
    String nome;
    double vida;
    int ataque;
    int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public Personagem() {
    }

    public String getNome() {
        return nome;
    }

    double calcularDano(int defesa, double poderDeAtaque) {
        return ataque * poderDeAtaque - defesa;
    }

    void registrar(String nomeDoAlvo, String skill, double dano) {
        System.out.println(this.nome + " atacou " + nomeDoAlvo + " com " + skill + " causando " + dano + " de dano.");
    }

    void registrarMorte() {
        System.out.println("(e sua morte)");
    }

}
