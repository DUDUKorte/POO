package Atividades.Cod_Fonte.Atv02;
import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args){
        Scanner inputNums = new Scanner(System.in);
        System.out.print("Informe um inteiro: ");
        int b = inputNums.nextInt();
        System.out.print("Informe um Inteiro: ");
        int c = inputNums.nextInt();
        int a = b + c;
        System.out.println("soma: "+a);
        inputNums.close();
    }
}
