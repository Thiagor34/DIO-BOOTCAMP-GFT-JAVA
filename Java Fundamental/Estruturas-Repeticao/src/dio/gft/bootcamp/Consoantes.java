package dio.gft.bootcamp;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdLetras = 0;

        int contador = 0;

        do{
            System.out.print("digite uma letra: ");
            String letra = input.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                qtdLetras++;
            }
            contador++;

        } while(contador < consoantes.length);

        for (String consoante : consoantes) {
            System.out.print(consoante + " ");

        }
    }
}
