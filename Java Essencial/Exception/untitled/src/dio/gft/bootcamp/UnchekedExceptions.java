package dio.gft.bootcamp;

import javax.swing.*;

public class UnchekedExceptions {
    public static void main(String[] args) {

        boolean continueLoop = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro. " + ex.getMessage());
                //ex.printStackTrace();
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, "Impossível dividir por Zero. " + ex.getMessage());
            } finally {
                System.out.println("Chegou até aqui");
            }

        } while (continueLoop);
        System.out.println("Terminou");

    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
