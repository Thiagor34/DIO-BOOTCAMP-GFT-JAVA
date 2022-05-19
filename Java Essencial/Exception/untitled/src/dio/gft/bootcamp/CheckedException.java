package dio.gft.bootcamp;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.io.*;
import java.sql.SQLOutput;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romance-blake-crouch.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que você deseja imprimir " + e.getCause());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado, entre em contato com o suporte " + e.getCause());
        } finally {
            System.out.println("Chegou no Finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }
    private static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);

        bw.flush();
        br.close();
    }
}
