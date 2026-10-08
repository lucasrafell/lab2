import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Rafael Gomes -124211901
 */

public class onde_esta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();

            if (linha.equals("wally")) {
                break;
            }

            String[] nomes = linha.split("\\s+");
            String ultimoCandidato = null;

            for (String nome : nomes) {
                if (nome.length() == 5) {
                    ultimoCandidato = nome;
                }
            }

            if (ultimoCandidato != null) {
                System.out.println(ultimoCandidato);
            } else {
                System.out.println("?");
            }
        }
    }
    
}
