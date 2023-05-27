import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Aqui estão os números de forma decrescente ");

        for (int i=100; i>=1; i--){
            System.out.println(i);
        }


        sc.close();
    }
}
