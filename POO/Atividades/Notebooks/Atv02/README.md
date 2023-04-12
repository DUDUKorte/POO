<hr>

## Notebook - Atv02

<hr>

### a)

> Inicializei o scanner

> imprimi na tela o texto solicitado

> solicitei entrada do usuário

> encerrei o scanner

<hr>

### b)

> declarei os valores b e c

> realizei o produto dos valores atribuindo-os na variável a

<hr>

### c)

> iniciei o scanner

> imprimi na tela um pedido ao usuário

> solicitei um número ao usuário

> realizei o cálculo dos descontos do salário

> realizei o desconto no salário informado

> exibi os valores na tela

> encerrei o scanner

  <hr>

> Código em java:

```
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

```
<hr>