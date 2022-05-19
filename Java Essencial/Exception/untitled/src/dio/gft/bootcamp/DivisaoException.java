package dio.gft.bootcamp;

public class DivisaoException extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
