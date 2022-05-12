package dio.gft.bootcamp;

public class Mensagem {

    public static void obterMensagem(int hora){

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12:
                mensagemBomDia();
                break;

            case 13, 14, 15, 16, 17, 18:
                mensagemBoaTarde();
                break;

            case 19, 20, 21, 22, 23, 24, 0, 1, 2, 3, 4:
                mensagemBoaNoite();
                break;

            default:
                System.out.println("Horário inválido!");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }

}
