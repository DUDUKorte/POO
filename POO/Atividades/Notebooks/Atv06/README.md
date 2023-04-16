<hr>

## Notebook - Atv06

<hr>

> 

  <hr>

> Código em java:

```
import java.util.Scanner; //importa biblioteca Scanner

public class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //inicializa o scanner

        System.out.print("Informe um valor fixo do depósito mensal: ");
        double depositoMensal = scan.nextDouble(); //solicita um valor para o usuário

        System.out.print("Informe o montante desejado: ");
        double montante = scan.nextDouble();

        double months = calcula(montante, depositoMensal); //chama o método calcula, com as variáveis necessárias para realizar o cálculo e retorna pra variável months

        System.out.println("Mêses necessários: " + months); //exibe o resultado na tela

        scan.close(); //encerra o Scanner
    }

    public static double calcula(double montante, double deposit){ //declara o método calcula, que retorna um valor double
        double months = 0;

        while(true){ //sistema de repetição while inicializado
            if(montante <= 0){ //verifica se o montante é menor ou igual a 0
                break; //realiza um break para finalizar/interromper o while
            }
            months += 1; //incrementa variável months em 1 
            montante -= deposit; //reduz o depósito do montante
            deposit *=  1.05; //adiciona 5% de juros ao depósito
        }
        return months; //retorna o valor de months
    }
}
```
<hr>