import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma =0;

        for (int i=0; i<100; i++){
            if (i % 2 == 1) {
                    soma+=i;
            }
        }

        System.out.println("Soma dos 50 primeiros números impares -> "+ soma);

        sc.close();
    }
}
