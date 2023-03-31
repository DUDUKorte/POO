/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 30/03/2022
 */

 package Atividades.Cod_Fonte.Atv04;

public class BalancoTrimestral { //declara classe
    public static void main(String[] args){ //declara método main
        //declaração de variáveis
        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //realiza soma dos valores

        System.out.println("Gastos do Trimestre: " + gastosTrimestre); //Exibe a informação final na tela

        double mediaMensal = gastosTrimestre/3; //Realiza o cálculo da média mensal de gastos

        System.out.println("Valor da média mensal = "+mediaMensal); //exibe a informação final na tela

    }
}