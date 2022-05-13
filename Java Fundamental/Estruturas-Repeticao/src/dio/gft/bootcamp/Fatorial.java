package dio.gft.bootcamp;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = input.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.print(multiplicacao);
    }
}
