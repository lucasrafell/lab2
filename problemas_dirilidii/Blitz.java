/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Rafael Gomes -124211901
 */
import java.util.Scanner;

public class Blitz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        int dias_carro = sc.nextInt();
        int dias_carteira = sc.nextInt();
        double bafometro = sc.nextDouble();

        boolean apreendido= dias_carro >= 30 || dias_carteira >=30 || bafometro > 0.05;

        if(apreendido){
            System.out.println("True");
        }else{
            System.out.println("False");
              }

    }

}
