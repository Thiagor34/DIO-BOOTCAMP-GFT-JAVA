package dio.gft.bootcamp;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class ExceptionPersonalizadaDois {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoException("Divisão não exata", numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException |DivisaoException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        System.out.println("O programa continua..");
    }
}

