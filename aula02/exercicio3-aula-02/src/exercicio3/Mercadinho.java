package exercicio3;

import java.util.List;

public class Mercadinho {
    public static void main(String[] args) {

        Item pao = new Item("Pão",Segmento.ALIMENTAÇÃO,4.5,3);
        Item sabonete = new Item("Sabonete",Segmento.HIGIENE,2.9,8);
        Item vassoura = new Item("Vassoura",Segmento.LIMPEZA,14.9,2);

        List<Item> itens;

        System.out.println(pao);
        System.out.println(sabonete);
        System.out.println(vassoura);
    }
}
