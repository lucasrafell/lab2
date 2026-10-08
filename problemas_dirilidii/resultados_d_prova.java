import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Rafael Gomes -124211901
 */

public class resultados_d_prova {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        long soma = 0;
        int total = 0;
        int acima = 0;
        int abaixo = 0;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();

            if (linha.equals("-")) {
                break;
            }

            String[] partes = linha.split("\\s+");
            int nota = Integer.parseInt(partes[partes.length - 1]);

            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }

            soma += nota;
            total++;

            if (nota >= 700) {
                acima++;
            } else {
                abaixo++;
            }
        }

        long media = soma / total;

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }
    
}
