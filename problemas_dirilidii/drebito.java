import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Lucas Rafael Gomes -124211901
 */

public class drebito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = Double.parseDouble(scanner.nextLine().trim());
        String tipoPagamento = scanner.nextLine().trim();

        if (tipoPagamento.equals("debito")) {
            System.out.println(valor + " REAIS NO DEBITO");
        } else {
            String parcelado = scanner.nextLine().trim();
            if (parcelado.equals("n")) {
                System.out.println(valor + " REAIS NO CREDITO (DIRETO)");
            } else {
                int parcelas = Integer.parseInt(scanner.nextLine().trim());
                double valorParcela = valor / parcelas;
                System.out.println(parcelas + " PARCELAS DE " + valorParcela + " REAIS");
            }
        }
    }

    
}
