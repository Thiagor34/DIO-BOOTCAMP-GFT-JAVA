package dio.gft.bootcamp;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] m = new int[4][4];

        for (int linha = 0; linha < m.length; linha++){
            for (int coluna = 0; coluna < m[linha].length; coluna++){
                m[linha][coluna] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha: m) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna);
            }
            System.out.println();
        }
    }
}
