package Atividades.Cod_Fonte.Atv06;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String T = scan.nextLine();
        
        
        if(T.length() <= 140){
            System.out.println("TWEET");
        }else{
            System.out.println("MUTE");
        }
 
    }
 
}