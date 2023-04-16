<hr>

## Notebook - Atv03

<hr>

> 

  <hr>

> Código em java:

```
import javax.swing.JOptionPane; //importa a biblioteca JOptionPane

public class Atv03 {
    public static void main(String[] args){
        float prova1;
        float prova2;
        String entrada;
        try { //inicialização do try catch para caso encontre algum erro no JOptionPane
            entrada = JOptionPane.showInputDialog("Nota da Prova 1: "); //Abre um input do JOptionPane para receber um valor do usuário
            prova1 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Nota da Prova 2: ");
            prova2 = Float.parseFloat(entrada);

            float media = (prova1 + prova2) / 2; //realiza o cálculo da média
            JOptionPane.showMessageDialog(null, "Média das notas: " + media); //exibe uma mensagem do JOptionPane informando a média 
        } catch (Exception e) { //Entra no catch caso encontre qualquer erro no código acima, dentro do try
            JOptionPane.showMessageDialog(null, "Houve um erro! Tente novamente"); //exibe uma mensagem de erro caso entre no catch
        }
    }
}


```
<hr>