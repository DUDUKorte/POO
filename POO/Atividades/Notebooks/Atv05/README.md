<hr>

## Notebook - Atv05

<hr>

> 

  <hr>

> Código em java:

```
public class MediaMensal {
    public static void main(String[] args){
        //Declaração das variáveis
        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;

        //Realiza os cálculos dos gastos
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        //Exibe os resultados na tela
        System.out.println("Gastos do Trimestre: " + gastosTrimestre);

        //Realiza os cálculos da media mensal
        double mediaMensal = gastosTrimestre/3;

        //Exibe os valores na tela
        System.out.println("Valor da média mensal = "+mediaMensal);

    }
}

```
<hr>
