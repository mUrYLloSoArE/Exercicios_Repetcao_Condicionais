import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("Digite as opções de (1-7) para descobrir o dia da semana ");
        opcao=sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println(" Hoje é Domingo! ");
                break;
            case  2:
                System.out.println(" Hoje é Segunda-Feira! ");
                break;
            case  3:
                System.out.println(" Hoje é Terça-Feira! ");
                break;
            case 4:
                System.out.println(" Hoje é Quarta-Feira! ");
                break;
            case 5:
                System.out.println(" Hoje é Quinta-Feira! ");
                break;
            case 6:
                System.out.println(" Hoje é Sexta-Feira! ");
                break;
            case 7:
                System.out.println(" Hoje é Sábado! ");
                break;
            default:
                System.out.println(" Opção inválida! ");
                break;
        }

        sc.close();
    }
}
