import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma =0;
        int inicio;
        int fim;


        System.out.println(" Digite um numéro de intervalo inicial ");
        inicio=sc.nextInt();
        System.out.println(" Digite um numéro de intervalo final ");
        fim = sc.nextInt();


        for (int i=inicio; i<fim; i++){
            if (i % 2 == 1) {
                soma+=i;
            }
        }
        if (inicio<0 || fim<inicio){
            System.out.println("Intervalos invalidos! ");
        }

        System.out.println("Soma dos números impares -> "+ soma);

        sc.close();
    }
}
