import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd;
        double media=0.0;
        double num=0.0;


        System.out.println("Programa que realiza a média aritimética dos números ");

        System.out.println(" Digite a quantidade de números");
        qtd = sc.nextInt();

        for (int i=1; i<=qtd; i++){
            System.out.println(" Digite o " + i + "º" + " número");
            num = sc.nextDouble();
            media+=num/qtd;
        }

        System.out.println("O resultado da média é -> " + Math.round(media));

        sc.close();
    }
}
