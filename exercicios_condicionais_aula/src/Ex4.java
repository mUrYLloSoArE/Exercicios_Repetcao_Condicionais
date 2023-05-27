import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas;
        double valorHora;
        double percentual = 0;
        double reajuste = 0;
        double salário_ajustado = 0;

        System.out.println(" Programa que calcula o seu salário ");

        System.out.println(" Quantas horas você trabalha por dia? ");
        horas=sc.nextInt();

        System.out.println(" Qual o valor da sua hora? ");
        valorHora=sc.nextDouble();

        double salario =(horas*valorHora)*30;

        System.out.println(" O seu salário bruto é -> " + salario);

        if (salario<=280){
            percentual =0.2;
            reajuste=salario*percentual;
            salário_ajustado=salario+reajuste;
        } else if (salario > 280 && salario<=700) {
            percentual =0.15;
            reajuste=salario*percentual;
            salário_ajustado=salario+reajuste;
        }else if (salario > 700 && salario<=1500) {
            percentual =0.1;
            reajuste=salario*percentual;
            salário_ajustado=salario+reajuste;
        }else if (salario>1500){
            percentual =0.05;
            reajuste=salario*percentual;
            salário_ajustado=salario+reajuste;
        }

        System.out.println(" Aumento percentual de " + percentual*100 + "%");
        System.out.println(" Valor do aumento -> " + reajuste);
        System.out.println("O seu salário após o reajuste -> " + salário_ajustado);

        sc.close();
    }
}
