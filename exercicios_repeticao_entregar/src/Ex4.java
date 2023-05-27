import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd;
        double soma=0.0;
        double num=0.0;


        System.out.println("Programa que realiza a soma dos números ");

        System.out.println(" Digite a quantidade de números");
        qtd = sc.nextInt();

        for (int i=1; i<=qtd; i++){
            System.out.println(" Digite o " + i + "º" + " número");
            num = sc.nextDouble();
            soma+=num;
        }

        System.out.println("O resultado da soma é -> " + Math.round(soma));

        sc.close();
    }
}
