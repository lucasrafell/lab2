/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Rafael Gomes -124211901
 */

import java.util.Scanner;

public class funcao_monotama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean crescente = a < b && b < c && c < d;
        boolean decrescente = a > b && b > c && c > d;

        if (crescente) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else if (decrescente) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
    }
    
}
