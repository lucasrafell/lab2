import java.util.Scanner;
public class SorVeTes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pos1 = sc.nextInt();
        int velocidade1 = sc.nextInt();
        int pos2 = sc.nextInt();
        int velocidade2 = sc.nextInt();
        int tempo = sc.nextInt();

        int objt1 = pos1 + velocidade1 * tempo;
        int objt2 = pos2 + velocidade2 * tempo;
        int diferenca = Math.abs(objt1 - objt2);
        System.out.println(diferenca);


    }

}