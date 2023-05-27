import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.println("Digite o primeiro numero ");
        num1=sc.nextInt();

        System.out.println("Digite o segundo numero ");
        num2=sc.nextInt();

        if (num1>num2){
            System.out.println(" O Primeiro número  -> "+ num1 +" é maior que o segundo número -> " + num2);
        }else {
            System.out.println(" O Segundo número -> "+ num2 +" é maior que o primeiro número ->  " + num1);
        }

        sc.close();
    }
}
