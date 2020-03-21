package exercicio2;

public class App {
    public static void main(String[] args) {
        Livro romeuEJulieta = new Livro("Romeu e Julieta", "Shakespeare", Categoria.ROMANCE, Status.EM_USO);
        Livro hamlet = new Livro("Hamlet", "Shakespeare",Categoria.ROMANCE, Status.DISPONÍVEL);
        Livro brasCubas = new Livro("Brás Cubas", "Machado de Assis",Categoria.ROMANCE, Status.DISPONÍVEL);
        Livro tsoiaf = new Livro("The Song of Ice and Fire", "George R. R. Martin", Categoria.FANTASIA, Status.EM_USO);
        Livro médicoMonstro = new Livro("O Médico e o Monstro", "Dr. Jekyll", Categoria.TERROR, Status.EMPRESTADO);

        System.out.println(romeuEJulieta);
        System.out.println(hamlet);
        System.out.println(brasCubas);
        System.out.println(tsoiaf);
        System.out.println(médicoMonstro);

    }

}
