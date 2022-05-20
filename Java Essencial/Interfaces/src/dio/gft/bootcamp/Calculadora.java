package dio.gft.bootcamp;

class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double n1, double n2) {
        System.out.println("soma: " + n1 + n2);
    }

    @Override
    public void subtracao(double n1, double n2) {
        System.out.println("subtração: " + (n1 - n2));
    }

    @Override
    public void multiplicacao(double n1, double n2) {
        System.out.println("multiplicação: " + n1 * n2);
    }

    @Override
    public void divisao(double n1, double n2) {
        System.out.println("divisão: " + n1 / n2);
    }
}
