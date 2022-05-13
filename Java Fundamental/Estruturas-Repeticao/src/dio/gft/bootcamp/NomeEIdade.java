package dio.gft.bootcamp;

import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.print("Nome: ");
            nome = input.next();
            if (nome.equals("0")){
                break;
            }
            System.out.print("Idade: ");
            idade = input.nextInt();
        }

        System.out.println("Encerrando..");
    }
}
