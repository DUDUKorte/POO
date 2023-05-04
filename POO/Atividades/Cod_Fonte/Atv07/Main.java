/**
 * Main
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String notas[] = new String[5];

        for(int i = 0; i<5;i++){
            notas[i] = JOptionPane.showInputDialog("Digite a nota "+(i+1)+"!");
            System.out.println(notas[i]);
        }
        JOptionPane.showMessageDialog(null,"A média das notas é: "+calcularMedia(notas));
        JOptionPane.showMessageDialog(null,"As notas em ordem decrescente é " + ordenarDecrescente(notas));
    }

    public static double calcularMedia(String[] notas){
        double media = 0;
        for(int i = 0; i<5;i++){
            media += Double.parseDouble(notas[i]);
        }
        media /= 5;
        return media;
    }

    public static String ordenarDecrescente(String[] notas){
        for(int i = 0; i<5;i++){
            for(int j = 0; j<5;j++){
                if(notas[i].compareTo(notas[j])>0){
                    String aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }

        String saida = "";

        for(int i = 0; i<5; i++){
            saida += notas[i];
        }
        return saida;
    }
}