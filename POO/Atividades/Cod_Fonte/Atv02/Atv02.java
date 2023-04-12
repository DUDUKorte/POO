package Atividades.Cod_Fonte.Atv02;
import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args){
        /*
        Scanner inputNums = new Scanner(System.in);
        System.out.print("Informe um inteiro: ");
        int b = inputNums.nextInt();
        System.out.print("Informe um Inteiro: ");
        int c = inputNums.nextInt();
        int a = b + c;
        System.out.println("soma: "+a);
        inputNums.close();
        */

        /*
        int b = 5;
        int c = 2;
        int a = b*c;
        */

        //Cálculo de folha de pagamento --
        Scanner scan = new Scanner(System.in); //inicia o scanner
        System.out.print("Informe o salário: ");
        double salario = scan.nextDouble(); //Solicita o salário para o user

        //Descontos -- Valores apenas de exemplo utilizados considerando um salário de R$3.000
        double FGTS = salario * 0.08;
        double INSS = salario * 0.11;
        double IRRF = 61.40; //Número utilizado apenas para exemplo*
        double descontos = FGTS + INSS + IRRF;
        salario -= descontos; //Realiza os descontos do salário 

        //Info
        System.out.printf("Resultado da folha de pagamento: %.2f", salario); //Exibe os valores na tela

        scan.close(); //encerra o scanner
    }
}
