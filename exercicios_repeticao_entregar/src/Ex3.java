import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double num=0.0;
        double maior=0.0;
        double menor=0.0;
        boolean condicao=true;


        System.out.println("Programa que verifica o maior e o menor número ");



        for (int i=1; i<=10; i++){
            System.out.println(" Digite o " + i + "º" + " número");
            num = sc.nextDouble();
            if (condicao == true){
                maior = num;
                menor = num;
            }
            condicao = false;
            if (num>maior){
                maior=num;
            }
            if (num<menor){
                menor=num;
            }
        }


        System.out.println(" O maior número é -> " + maior);
        System.out.println(" O menor número é -> " + menor);



        sc.close();
    }
}
