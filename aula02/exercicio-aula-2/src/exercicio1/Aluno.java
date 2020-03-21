package exercicio1;

public class Aluno {
    double obterNota;

     void Aluno(double obterNota) {     //antes do void está implícito o DEFAULT
        this.obterNota = obterNota;
    }

    private int montarCola;

    public Aluno(int montarCola) {
        this.montarCola = montarCola;
    }

    final String nome(String nome){
        return "Joãozinho";
    }

}
