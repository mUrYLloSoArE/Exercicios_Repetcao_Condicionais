import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double soma=0.0;
        System.out.println("Programa que realiza a soma de 5 números ");

        for (int i=1; i<=5; i++){
            System.out.println(" Digite o " + i + "º" + " número");
            num = sc.nextDouble();
            soma+=num;
        }

        System.out.println("O resultado da soma é -> " + soma);

        sc.close();
    }
}
