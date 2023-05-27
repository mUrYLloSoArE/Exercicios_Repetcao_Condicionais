import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=1;
        double num;
        double media=0.0;

        System.out.println(" Programa que calcula a média aritimética ");

        System.out.println(" Forneça 4 números ");

        while (contador <=4){
            System.out.println(" Digite o " + contador + "º" + " número");
            num = sc.nextDouble();
            contador++;
            media+=num/4;
        }

        System.out.println("A sua média é igual a -> " + media);

        sc.close();
    }
}
