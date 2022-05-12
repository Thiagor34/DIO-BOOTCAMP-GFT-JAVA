package dio.gft.bootcamp;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 8.7;
    }

    public static double geTaxaTresParcelas() {
        return 1.78;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo de 2 parcelas: " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * geTaxaTresParcelas());
            System.out.println("Valor final do empréstimo de 3 parcelas: " + valorFinal);
        } else {
            System.out.println("Não possível calcular essas parcelas!");
        }
    }

}
