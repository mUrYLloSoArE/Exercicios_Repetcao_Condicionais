import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo ou não! ");
        int num= sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Não é um número primo");
        }else{
            System.out.println("É um número primo");
        }

        sc.close();
    }
}
