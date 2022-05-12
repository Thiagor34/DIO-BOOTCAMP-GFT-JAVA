package dio.gft.bootcamp;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora ------->");
        Calculadora.soma(5,10);
        Calculadora.subtracao(15, 7);
        Calculadora.multiplicacao(5, 10.2);
        Calculadora.divisao(7, 4);

        System.out.println("Mensagens ------->");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(50);

        System.out.println("Empréstimo ------->");
        Emprestimo.calcular(100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,4);
    }
}
