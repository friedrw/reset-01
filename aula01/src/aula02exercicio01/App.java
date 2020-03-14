package aula02exercicio01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Terrestre caminhao = new Terrestre("Caminhão", 90, 4, "Diesel", "Terrestre", 20);
        Terrestre carro = new Terrestre("Carro", 180, 5, "Gasolina", "Terrestre", 4);
        Terrestre bicicleta = new Terrestre("Bicicleta", 60, 1, "Fôlego", "Terrestre", 2);
        Terrestre trem = new Terrestre ("Trem",240, 600, "Elétrico", "Terrestre", 16);
        Aereo aviao = new Aereo("Avião", 960, 400,"Gasolina","Aéreo",11800, 16);
        Maritimo navio = new Maritimo("Navio", 70,3600,"Diesel","Água");
        Submarino mergulhao = new Submarino("Mergulhão", 28, 150,"Diesel","Água");

        Scanner in = new Scanner(System.in);

    }

}
