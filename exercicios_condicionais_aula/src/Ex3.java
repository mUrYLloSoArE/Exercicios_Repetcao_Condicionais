import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota ");
        double n1=sc.nextDouble();

        System.out.println("Digite a sua segunda nota ");
        double n2=sc.nextDouble();


        double media=(n1+n2)/2;
        System.out.println(" A sua média final foi -> " + Math.round(media));

        if (media >= 7.0 && media <= 9.0){
            System.out.println(" APROVADO! ");
        } else if (media == 10.0) {
            System.out.println(" APROVADO COM DISTINÇÃO! ");
        }else {
            System.out.println(" REPROVADO! ");
        }


        sc.close();
    }
}
