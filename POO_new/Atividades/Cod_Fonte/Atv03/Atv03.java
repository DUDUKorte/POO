/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 30/03/2022
 */
package Atividades.Cod_Fonte.Atv03;
import javax.swing.JOptionPane;

public class Atv03 {
    public static void main(String[] args){
        float prova1;
        float prova2;
        String entrada;
        try {
            entrada = JOptionPane.showInputDialog("Nota da Prova 1: ");
            prova1 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Nota da Prova 2: ");
            prova2 = Float.parseFloat(entrada);

            float media = (prova1 + prova2) / 2;
            JOptionPane.showMessageDialog(null, "Média das notas: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro! Tente novamente");
        }
    }
}
