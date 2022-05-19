package dio.gft.bootcamp;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();
        } catch (ImpossivelAberturaException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaException(file.getName(), file.getPath());
        }
    }
}
class ImpossivelAberturaException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

   /* @Override
    public String toString() {
        return "ImpossivelAberturaException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }*/
}