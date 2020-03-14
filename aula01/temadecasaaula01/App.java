package temadecasaaula01;

public class App {
    public static void main(String[] args) {

        Guerreiro siegfried = new Guerreiro("Siegfried", 500, 150, 200);
        Guerreiro hagen = new Guerreiro("Hagen", 400, 130, 75);
        Barbaro conan = new Barbaro("Conan", 600, 130, 90);
        Mago salabin = new Mago("Salabin", 350, 175, 75, 300);
        Feiticeiro alberich = new Feiticeiro("Alberich", 400, 150, 85, 275);
        Druida merlin = new Druida("Merlin", 375, 180, 70, 300);
        Clerigo dorime = new Clerigo("Dorime", 350,190, 65,350);

        Armas espada = new Armas ("Balmung", 1);
        Armas arcoEFlecha = new Armas("Arco Longo", 0.7);
        Armas machado = new Armas("Machado Duplo", 0.8);
        Magias coleraDoDragao = new Magias("Cólera do Dragão", 1.25, 60);
        Magias explosaoAurora = new Magias("Explosão Aurora", 1.2, 50);
        PoderesDivinos tempestadeEstelar = new PoderesDivinos("Tempestade Estelar", 1.5, 90);
        PoderesDivinos queimaDePecados = new PoderesDivinos("Queima de Pecados", 1.6, 100);

        //Primeira Rodada
        System.out.println("TEM INÍCIO O COMBATE!!");
        System.out.println("Primeira rodada de combate:");
        double ataque1 = siegfried.atacar(conan, espada);
        System.out.println(siegfried.nome +" atacou "+conan.nome +" com "+ espada.nome +" causando "+ ataque1 +" de dano.");
        double ataque2 = hagen.atacar(dorime,arcoEFlecha);
        System.out.println(hagen.nome +" atacou "+dorime.nome+" com "+arcoEFlecha.nome+" causando "+ataque2+" de dano.");
        double ataque3 = conan.atacar(alberich,machado);
        System.out.println(conan.nome +" atacou "+alberich.nome+" com "+machado.nome+" causando "+ataque3+" de dano.");
        double ataque4 = salabin.atacar(siegfried,coleraDoDragao);
        System.out.println(salabin.nome +" atacou "+siegfried.nome+" com "+coleraDoDragao.nome+" causando "+ataque4+" de dano.");
        double ataque5 = alberich.atacar(conan,explosaoAurora);
        System.out.println(alberich.nome +" atacou "+conan.nome+" com "+explosaoAurora.nome+" causando "+ataque5+" de dano.");
        double ataque6 = merlin.atacar(hagen,tempestadeEstelar);
        System.out.println(merlin.nome +" atacou "+hagen.nome+" com "+tempestadeEstelar.nome+" causando "+ataque6+" de dano.");
        double ataque7 = dorime.atacar(merlin,queimaDePecados);
        System.out.println(dorime.nome +" atacou "+merlin.nome+" com "+queimaDePecados.nome+" causando "+ataque7+" de dano.");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Stati após primeira rodada:");
        System.out.println("Personagem "+siegfried.nome+" está com "+siegfried.vida+" de vida.");
        System.out.println("Personagem "+hagen.nome+" está com "+hagen.vida+" de vida.");
        System.out.println("Personagem "+conan.nome+" está com "+conan.vida+" de vida.");
        System.out.println("Personagem "+salabin.nome+" está com "+salabin.vida+" de vida e "+salabin.mana+" de mana.");
        System.out.println("Personagem "+alberich.nome+" está com "+alberich.vida+" de vida e "+alberich.mana+" de mana.");
        System.out.println("Personagem "+merlin.nome+" está com "+merlin.vida+" de vida e "+merlin.fé+" de fé.");
        System.out.println("Personagem "+dorime.nome+" está com "+dorime.vida+" de vida e "+dorime.fé+" de fé.");


        //Segunda Rodada
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Segunda rodada de combate:");
        double ataque8 = siegfried.atacar(dorime,espada);
        System.out.println(siegfried.nome +" atacou "+dorime.nome +" com "+ espada.nome +" causando "+ ataque8 +" de dano.");
        double ataque9 = hagen.atacar(merlin,arcoEFlecha);
        System.out.println(hagen.nome +" atacou "+merlin.nome +" com "+ arcoEFlecha.nome +" causando "+ ataque9 +" de dano.");
        double ataque10 = conan.atacar(hagen,machado);
        System.out.println(conan.nome +" atacou "+hagen.nome +" com "+ machado.nome +" causando "+ ataque10 +" de dano.");
        double ataque11 = salabin.atacar(alberich,coleraDoDragao);
        System.out.println(salabin.nome +" atacou "+alberich.nome +" com "+ coleraDoDragao.nome +" causando "+ ataque11 +" de dano.");
        double ataque12 = alberich.atacar(merlin,explosaoAurora);
        System.out.println(alberich.nome +" atacou "+merlin.nome +" com "+ explosaoAurora.nome +" causando "+ ataque12 +" de dano.");
        double ataque13 = merlin.atacar(siegfried,tempestadeEstelar);
        System.out.println(merlin.nome +" atacou "+siegfried.nome +" com "+ tempestadeEstelar.nome +" causando "+ ataque13 +" de dano.");
        double ataque14 = dorime.atacar(siegfried,queimaDePecados);
        System.out.println(dorime.nome +" atacou "+siegfried.nome +" com "+ queimaDePecados.nome +" causando "+ ataque14 +" de dano.");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Stati após segunda rodada:");
        System.out.println("Personagem "+siegfried.nome+" está com "+siegfried.vida+" de vida.");
        System.out.println("Personagem "+hagen.nome+" está com "+hagen.vida+" de vida.");
        System.out.println("Personagem "+conan.nome+" está com "+conan.vida+" de vida.");
        System.out.println("Personagem "+salabin.nome+" está com "+salabin.vida+" de vida e "+salabin.mana+" de mana.");
        System.out.println("Personagem "+alberich.nome+" está com "+alberich.vida+" de vida e "+alberich.mana+" de mana.");
        System.out.println("Personagem "+merlin.nome+" está com "+merlin.vida+" de vida e "+merlin.fé+" de fé.");
        System.out.println("Personagem "+dorime.nome+" está com "+dorime.vida+" de vida e "+dorime.fé+" de fé.");
    }
}
