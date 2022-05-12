package dio.gft.bootcamp;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior * baseMenor)* altura / 2));
    }

    public static void area(float diagonal1, float diagnonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagnonal2)/2);
    }
}
