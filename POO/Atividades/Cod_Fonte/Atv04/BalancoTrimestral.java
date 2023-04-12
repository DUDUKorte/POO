package Atividades.Cod_Fonte.Atv04;

public class BalancoTrimestral {
    public static void main(String[] args){
        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos do Trimestre: " + gastosTrimestre);
    }
}
