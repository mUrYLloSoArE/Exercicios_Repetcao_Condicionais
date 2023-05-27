import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double prod1, prod2, prod3;

        System.out.println(" Digite o preço do primeiro produto ");
        prod1=sc.nextDouble();

        System.out.println(" Digite o preço do segundo produto ");
        prod2=sc.nextDouble();

        System.out.println(" Digite o preço do terceiro produto ");
        prod3=sc.nextDouble();

        if (prod1<prod2 && prod1<prod3){
            System.out.println(" O produto 1 é o mais barato recomendo comprar! ");
        } else if (prod2<prod1 && prod2<prod3){
            System.out.println(" O produto 2 é o mais barato recomendo comprar! ");
        }else {
            System.out.println(" O produto 3 é o mais barato recomendo comprar! ");
        }

        sc.close();
    }
}
