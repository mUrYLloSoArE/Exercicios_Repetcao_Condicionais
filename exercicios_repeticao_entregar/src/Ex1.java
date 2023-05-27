import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=1;

        System.out.println("Exercicio 1 Realizado com For");
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }

        System.out.println("Exercicio 1 Realizado com While");
        while (cont<=100){
            System.out.println(cont);
            cont++;
        }

        sc.close();
    }
}
