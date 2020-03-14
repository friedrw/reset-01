public class App {

    public static void main(String[] args) {

        Calculadora calculadoraDeIdades = new Calculadora();

        int somaDasIdades = calculadoraDeIdades.somar(33, 54);
        System.out.println("Soma das idades: " + somaDasIdades);

        int subtraçãoDasIdades = calculadoraDeIdades.subtrair(33,54);
        System.out.println("Subtração das idades: " + subtraçãoDasIdades);

        int multiplicaçãoDeIdades = calculadoraDeIdades.multiplicar(33,54);
        System.out.println("Multiplicação das idades: " + multiplicaçãoDeIdades);

        double divisãoDeIdades = calculadoraDeIdades.dividir(33,54);
        System.out.println("Divisão de Idades: " + divisãoDeIdades);

        Comparador comparadorDeIdades = new Comparador();

        boolean comparaçãoDeIdades = comparadorDeIdades.menorQue(33,54);
        System.out.println(comparaçãoDeIdades);
    }
}
