/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 30/03/2022
 */

package Atividades.Cod_Fonte.Atv02;
import java.util.Scanner; //Importa a biblioteca do scanner

public class Atv02 { //declara a classe
    public static void main(String[] args){ //declara método main
        Scanner inputNums = new Scanner(System.in); //inicializa o scanner
        System.out.print("Informe um inteiro: ");
        int b = inputNums.nextInt(); //Requisita uma entrad do usuário no scanner
        System.out.print("Informe um Inteiro: ");
        int c = inputNums.nextInt();
        int a = b + c; //realiza a soma dos valores
        System.out.println("soma: "+a);
        inputNums.close(); //encerra o scanner
    }
}