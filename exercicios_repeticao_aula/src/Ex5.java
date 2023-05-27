import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Quantidade de pessoas na fila ");

        for (int i=200; i>=0; i-=10){
            System.out.println(i);
            if (i==0){
                System.out.println(" A fila do banco foi zerada ");
                System.out.println(" Por favor pegue uma nova senha! ");
            }
        }

        sc.close();
    }
}
