package temadecasaaula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Crie seus personagens para que o combate possa começar!!");
        System.out.println("Primeiro, escolha a classe do personagem:");
        System.out.println("G - Guerreiro");
        System.out.println("B - Bárbaro");
        System.out.println("C - Clérigo");
        System.out.println("D - Druida");
        System.out.println("M - Mago");
        System.out.println("F - Feiticeiro");

        List<Personagem> combatentes = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Classe: ");
            char classe = in.next().charAt(0);

            switch (classe) {
                case 'G':
                    Guerreiro guerreiro = new Guerreiro();
                    System.out.println("Nome: ");
                    guerreiro.nome = in.next();
                    System.out.println("Vida: ");
                    guerreiro.vida = in.nextInt();
                    System.out.println("Ataque: ");
                    guerreiro.ataque = in.nextInt();
                    System.out.println("Defesa: ");
                    guerreiro.defesa = in.nextInt();
                    guerreiro.imprimirStatus();
                    Arma espada = new Arma("Espada Longa", 1.2);
                    guerreiro.equiparArma(espada);
                    combatentes.add(guerreiro);
                    break;

                case 'B':
                    Barbaro barbaro = new Barbaro();
                    System.out.println("Nome: ");
                    barbaro.nome = in.next();
                    System.out.println("Vida: ");
                    barbaro.vida = in.nextInt();
                    System.out.println("Ataque: ");
                    barbaro.ataque = in.nextInt();
                    System.out.println("Defesa: ");
                    barbaro.defesa = in.nextInt();
                    barbaro.imprimirStatus();
                    Arma machado = new Arma("Machado Duplo", 1);
                    barbaro.equiparArma(machado);
                    combatentes.add(barbaro);
                    break;

                case 'M':
                    Mago mago = new Mago();
                    System.out.println("Nome: ");
                    mago.nome = in.next();
                    System.out.println("Vida: ");
                    mago.vida = in.nextInt();
                    System.out.println("Ataque: ");
                    mago.ataque = in.nextInt();
                    System.out.println("Defesa: ");
                    mago.defesa = in.nextInt();
                    System.out.println("Mana: ");
                    mago.mana = in.nextInt();
                    mago.imprimirStatus();
                    combatentes.add(mago);

                    break;
                case 'F':
                    Feiticeiro feiticeiro = new Feiticeiro();
                    System.out.println("Nome: ");
                    feiticeiro.nome = in.next();
                    System.out.println("Vida: ");
                    feiticeiro.vida = in.nextInt();
                    System.out.println("Ataque: ");
                    feiticeiro.ataque = in.nextInt();
                    System.out.println("Defesa: ");
                    feiticeiro.defesa = in.nextInt();
                    System.out.println("Mana: ");
                    feiticeiro.mana = in.nextInt();
                    feiticeiro.imprimirStatus();
                    combatentes.add(feiticeiro);
                    break;

                case 'D':
                    Druida druida = new Druida();
                    System.out.println("Nome: ");
                    druida.nome = in.next();
                    System.out.println("Vida: ");
                    druida.vida = in.nextInt();
                    System.out.println("Ataque: ");
                    druida.ataque = in.nextInt();
                    System.out.println("Defesa: ");
                    druida.defesa = in.nextInt();
                    System.out.println("Fé: ");
                    druida.fe = in.nextInt();
                    druida.imprimirStatus();
                    combatentes.add(druida);
                    break;

                case 'C':
                    Clerigo clerigo = new Clerigo();
                    System.out.println("Nome: ");
                    clerigo.nome = in.next();
                    System.out.println("Vida: ");
                    clerigo.vida = in.nextInt();
                    System.out.println("Ataque: ");
                    clerigo.ataque = in.nextInt();
                    System.out.println("Defesa: ");
                    clerigo.defesa = in.nextInt();
                    System.out.println("Fé: ");
                    clerigo.fe = in.nextInt();
                    clerigo.imprimirStatus();
                    combatentes.add(clerigo);
                    break;

            }

        }

        // if (classe =) {        }
        // if (classe =) {        }
        System.out.println("Criando personagem...");
        //Classe.classe = new personagem(nome,vida,ataque,defesa);

        Guerreiro siegfried = new Guerreiro("Siegfried", 500, 150, 200);
        Arma espada = new Arma("Espada Longa", 1.2);
        //a criação da arma vai precisar ir junto com a criação do guerreiro ou barbaro
        siegfried.equiparArma(espada);
        Guerreiro hagen = new Guerreiro("Hagen", 400, 130, 75);
        hagen.equiparArma(espada);
        Barbaro conan = new Barbaro("Conan", 600, 130, 90);
        Mago salabin = new Mago("Salabin", 350, 175, 75, 300);
        Feiticeiro alberich = new Feiticeiro("Alberich", 400, 150, 85, 450);
        Druida merlin = new Druida("Merlin", 375, 180, 70, 300);
        Clerigo dorime = new Clerigo("Dorime", 300, 190, 65, 350);

        Arma arcoEFlecha = new Arma("Arco Longo", 0.7);
        Arma machado = new Arma("Machado Duplo", 0.8);
        Magia coleraDoDragao = new Magia("Cólera do Dragão", 2.75, 60);
        Magia explosaoAurora = new Magia("Explosão Aurora", 1.2, 50);
        PoderDivino tempestadeEstelar = new PoderDivino("Tempestade Estelar", 1.5, 90);
        PoderDivino queimaDePecados = new PoderDivino("Queima de Pecados", 1.6, 100);

        List<Personagem> alvos = new ArrayList<>();
        alvos.add(siegfried);
        alvos.add(hagen);
        alvos.add(conan);
        alvos.add(salabin);
        alvos.add(alberich);
        alvos.add(merlin);
        alvos.add(dorime);

        alberich.lançarMagiaDeArea(alvos, coleraDoDragao);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Stati após primeira rodada:");
        System.out.println("Personagem " + siegfried.nome + " está com " + siegfried.vida + " de vida.");
        System.out.println("Personagem " + hagen.nome + " está com " + hagen.vida + " de vida.");
        System.out.println("Personagem " + conan.nome + " está com " + conan.vida + " de vida.");
        System.out.println("Personagem " + salabin.nome + " está com " + salabin.vida + " de vida e " + salabin.mana + " de mana.");
        System.out.println("Personagem " + alberich.nome + " está com " + alberich.vida + " de vida e " + alberich.mana + " de mana.");
        System.out.println("Personagem " + merlin.nome + " está com " + merlin.vida + " de vida e " + merlin.fe + " de fé.");
        System.out.println("Personagem " + dorime.nome + " está com " + dorime.vida + " de vida e " + dorime.fe + " de fé.");

        //Primeira Rodada
        System.out.println("TEM INÍCIO O COMBATE!!");
        System.out.println("Primeira rodada de combate:");
        siegfried.atacar(conan, espada);
        hagen.atacar(dorime, arcoEFlecha);
        conan.atacar(alberich, machado);
        hagen.atacar(conan, arcoEFlecha);
        siegfried.atacar(conan, espada);
        alberich.lançarMagia(conan, coleraDoDragao);
        siegfried.atacar(conan, espada);
        siegfried.atacar(conan, espada);
        siegfried.atacar(conan, espada);
        siegfried.atacar(conan, espada);
        siegfried.atacar(conan, espada);
        conan.atacar(alberich, machado);
        conan.atacar(alberich, machado);
        alberich.lançarMagia(conan, coleraDoDragao);
        alberich.lançarMagia(dorime, coleraDoDragao);
        alberich.lançarMagia(dorime, coleraDoDragao);
        alberich.lançarMagia(merlin, coleraDoDragao);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Stati após primeira rodada:");
        System.out.println("Personagem " + siegfried.nome + " está com " + siegfried.vida + " de vida.");
        System.out.println("Personagem " + hagen.nome + " está com " + hagen.vida + " de vida.");
        System.out.println("Personagem " + conan.nome + " está com " + conan.vida + " de vida.");
        System.out.println("Personagem " + salabin.nome + " está com " + salabin.vida + " de vida e " + salabin.mana + " de mana.");
        System.out.println("Personagem " + alberich.nome + " está com " + alberich.vida + " de vida e " + alberich.mana + " de mana.");
        System.out.println("Personagem " + merlin.nome + " está com " + merlin.vida + " de vida e " + merlin.fe + " de fé.");
        System.out.println("Personagem " + dorime.nome + " está com " + dorime.vida + " de vida e " + dorime.fe + " de fé.");

        //Segunda Rodada
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Segunda rodada de combate:");
        siegfried.atacar(dorime, espada);
        System.out.println(siegfried.nome + " atacou " + dorime.nome + " com " + espada.nome + " causando " + " de dano.");
        hagen.atacar(merlin, arcoEFlecha);
        System.out.println(hagen.nome + " atacou " + merlin.nome + " com " + arcoEFlecha.nome + " causando " + " de dano.");
        conan.atacar(hagen, machado);
        System.out.println(conan.nome + " atacou " + hagen.nome + " com " + machado.nome + " causando " + " de dano.");
        salabin.lançarMagia(alberich, coleraDoDragao);
        System.out.println(salabin.nome + " atacou " + alberich.nome + " com " + coleraDoDragao.nome + " causando " + " de dano.");
        alberich.lançarMagia(merlin, explosaoAurora);
        System.out.println(alberich.nome + " atacou " + merlin.nome + " com " + explosaoAurora.nome + " causando " + " de dano.");
        merlin.lançarPoder(siegfried, tempestadeEstelar);
        System.out.println(merlin.nome + " atacou " + siegfried.nome + " com " + tempestadeEstelar.nome + " causando " + " de dano.");
        dorime.lançarPoder(siegfried, queimaDePecados);
        System.out.println(dorime.nome + " atacou " + siegfried.nome + " com " + queimaDePecados.nome + " causando " + " de dano.");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Stati após segunda rodada:");
        System.out.println("Personagem " + siegfried.nome + " está com " + siegfried.vida + " de vida.");
        System.out.println("Personagem " + hagen.nome + " está com " + hagen.vida + " de vida.");
        System.out.println("Personagem " + conan.nome + " está com " + conan.vida + " de vida.");
        System.out.println("Personagem " + salabin.nome + " está com " + salabin.vida + " de vida e " + salabin.mana + " de mana.");
        System.out.println("Personagem " + alberich.nome + " está com " + alberich.vida + " de vida e " + alberich.mana + " de mana.");
        System.out.println("Personagem " + merlin.nome + " está com " + merlin.vida + " de vida e " + merlin.fe + " de fé.");
        System.out.println("Personagem " + dorime.nome + " está com " + dorime.vida + " de vida e " + dorime.fe + " de fé.");
    }
}
