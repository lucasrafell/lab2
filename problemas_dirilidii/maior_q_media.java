/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Rafael - 124211901
 */


import java.util.Scanner;

public class maior_q_media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        String[] partes = linha.trim().split("\\s+");

        int n = partes.length;
        int[] valores = new int[n];
        long soma = 0;

        for (int i = 0; i < n; i++) {
            valores[i] = Integer.parseInt(partes[i]);
            soma += valores[i];
        }

        double media = (double) soma / n;

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (valores[i] > media) {
                if (resultado.length() > 0) {
                    resultado.append(" ");
                }
                resultado.append(valores[i]);
            }
        }

        System.out.println(resultado.toString());
    }
    
}
