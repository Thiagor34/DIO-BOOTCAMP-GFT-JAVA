package dio.gft.bootcamp;

public class Main {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFleca();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchferias();
    }

    private static void ifFlecha() {
        int mes = 9;
        if (mes == 1) {
            System.out.printf("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifSemFleca() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        }  else {
            System.out.println("Dezembro");
        }
    }

    private static void ifFerias() {
        String mes = "Julho";

        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro")
            System.out.println("Em férias");
    }

    private static void ifMenor() {
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber Auxílio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes =quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber Auxílio");
        }

        boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);
        if (receberAuxilio) {
            System.out.println("Funcionário deve receber Auxílio");
        } else {
            System.out.println("Funcionário não deve receber Auxílio");
        }
    }

    private static void switchSemana() {
        String dia = "Terça";

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("valor indefinido.");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 2;

        switch (numero) {
            case 1, 2, 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Valor indefinido.");
                break;
        }
    }

    private static void switchferias() {
        String mes = "Dezembro";

        switch (mes) {
            case "Dezembro", "Julho", "Janeiro":
                System.out.println("Estamos de férias");
                break;
            default:
                System.out.println("Não estamos de férias");
                break;
        }
    }
}
