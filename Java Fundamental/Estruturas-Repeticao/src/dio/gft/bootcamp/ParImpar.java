package dio.gft.bootcamp;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int qtdNumero;
        int contador = 0;
        int contPar = 0;
        int contImpar = 0;

        System.out.print("Quantos números deseja informar: ");
        qtdNumero = input.nextInt();

        do{
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            contador++;
        } while (contador < qtdNumero);

        System.out.println("Quantidade de PAR: " + contPar);
        System.out.println("Quantidade de IMPAR: " + contImpar);
    }
}
