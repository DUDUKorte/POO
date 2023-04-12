/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 30/03/2022
 */
import java.util.Scanner; //importa biblioteca do scanner para receber valores do usuário

public class Atv01{
    public static void main(String[] args){
        Scanner inputNums = new Scanner(System.in); //cria novo scanner
        System.out.print("Digite um número: ");
        float num1 = inputNums.nextFloat(); //Pede uma entrada do usuário com o scanner
        System.out.print("Digite um segundo número: ");
        float num2 = inputNums.nextFloat(); //pede novamente uma entrada Float
        inputNums.close(); //Fecha o scanner utilizado

        float soma = num1 + num2; //realiza a soma dos 2 números
        System.out.println("Soma: "+num1+" + "+num2+" = "+ soma); //exibe soma na tela
    }
}