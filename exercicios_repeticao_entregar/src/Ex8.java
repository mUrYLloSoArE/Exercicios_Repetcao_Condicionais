import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fat=1;

        System.out.println("Digite um número para o calculo do Fatorial ");
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            System.out.println(i);
            fat*=i;
        }

        System.out.println("O fatorial do número é -> " + fat);

        sc.close();
    }
}
