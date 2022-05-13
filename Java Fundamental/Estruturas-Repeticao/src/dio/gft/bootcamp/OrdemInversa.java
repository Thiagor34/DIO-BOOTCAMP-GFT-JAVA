package dio.gft.bootcamp;

import java.util.Arrays;
import java.util.Collections;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] numero = {3,6,9,-15,50,10};

        for (int i = (numero.length -1); i >= 0; i--) {
            System.out.print(numero[i] + " ");
        }

    }
}
