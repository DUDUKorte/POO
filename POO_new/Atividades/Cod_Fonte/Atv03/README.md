/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 30/03/2022
 */

 package Atividades.Cod_Fonte.Atv03;
import javax.swing.JOptionPane; //Importa a biblioteca do JOptionPane

public class Atv03 { //declara classe
    public static void main(String[] args){ //declara o método main
        float prova1;
        float prova2;
        String entrada;
        try { //Utiliza o try para não retornar linhas de erro no código
            entrada = JOptionPane.showInputDialog("Nota da Prova 1: ");
            prova1 = Float.parseFloat(entrada); //Requisita entrada do usuário
            entrada = JOptionPane.showInputDialog("Nota da Prova 2: ");
            prova2 = Float.parseFloat(entrada);

            float media = (prova1 + prova2) / 2; //realiza a média dos valores
            JOptionPane.showMessageDialog(null, "Média das notas: " + media); //Informa uma mensagem na tela com a saída final
        } catch (Exception e) { //catch caso o try encontre um erro
            JOptionPane.showMessageDialog(null, "Houve um erro! Tente novamente"); //exibe mensagem de erro para o usuário e encerra o programa
        }
    }
}
