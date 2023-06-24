<hr>

## Notebook - Atv09

> Passos da atividade

  <hr>

> Código em java:

``` java
/*
* IFPR - Campus Cascavel

* Curso: Técnico em informática

* Disciplina: Programação orientada à objetos

* Professor: Nelson Bellincanta

* Data da criação: 22/06/2023
*/

public class ExercicioSemRetorno { //Criação da classe
    public static void main(String args[]){ //Método principal
        int[] myNums = {0,1,2,3,4,5,6,7,8,9}; //Array previamente criado com 10 números

        imprimirNumeros(myNums); //Chamada de método para imprimir os números
        somaNumeros(myNums); //Chamada de método para somar os números
        imprimirNumeros(myNums);
    }

    public static void imprimirNumeros(int[] nums){ //Criação de método sem retorno
        String output = ""; //Criação de saída como string
        for(int i : nums){ //For que percorre array nums com i tendo o valor de cada item
            if(i==nums[nums.length-1]){ //se o valor de i for igual ao último item da lista
                output+=i; //concatena somente o i à string
            }else{
                output+=i+" "; //Concatena o i e um espaço para a string de saída
            }
        }
        System.out.println(output); //Exibe String de saída na tela
    }

    public static void somaNumeros(int[] nums){ //Método para somar números sem retorno
        int soma = 0;
        for(int i : nums){ //For que percorre array nums com i tendo o valor de cada item
            soma += i; //Soma recebe soma + i
        }
        System.out.println(soma); //Mostra resultado da soma na tela
    }
}
```
<hr>
