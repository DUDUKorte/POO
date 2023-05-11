/*
* IFPR - Campus Cascavel

* Curso: Técnico em informática

* Disciplina: Programação orientada à objetos

* Professor: Nelson Bellincanta

* Data da criação: 11/05/2023
*/

import java.util.Scanner;

public class Atv08 { //Criação da classe da Atv08
    public static boolean assentos[] = new boolean[10]; //Cração de variável global dos assentos declarados como false por padrão
    public static void main(String[] args){ //Declaração do método main
        Scanner classeNum = new Scanner(System.in); //Declaração do scanner principal

        while(true){ //Início do while para continuar o código após registrar um usuário

            //Exibe os assentos disponíveis
            System.out.println("--------------------------------Assentos disponíveis--------------------------------");
            for(int i = 0; i< assentos.length; i++){ //For que percorre todo o array dos assentos
                String output = " -\t Primeira Classe";
                String statusAssento = "Livre";
                if(i < 5){ //Verifica se o assento é da primeira classe ou classe econômica
                    output = output;
                }else{
                    output = " -\t Classe Econômica";
                }

                if(!assentos[i]){ //Verifica se o assento atual está ocupado ou não
                    statusAssento = "Livre";
                }else{
                    statusAssento = "Ocupado";
                }

                System.out.println(statusAssento + output); //Exibe o assento atual e repete para todos os demais
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println();


            System.out.println("Por favor, digite seu nome:");
            String nome = classeNum.next(); //Solicita o nome ao usuário
            System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");
            String assentoChosen = classeNum.next(); //Solicita ao usuário se quer ir á primeira classe ou á classe econômica
            
            //Verifica qual foi a classe escolhida pelo usuário
            if(assentoChosen.equals("1")){ //Se escolheu a primeira classe (1)
                boolean occupied = false; //Variável para verificar se o assento foi comprado ou não
                occupied = assentoPrimeiraClasse(true, nome); //Chama o método que realiz a compra do assento
                
                if(!occupied){ //se nenhum assento foi ocupado, ou seja, nenhum assento está disponível, ele pergunta ao usuário se quer comprar outro assento
                    System.out.println("A primeira classe está cheia, deseja comprar um assento na classe econômica? (Y/N)");
                    String _assentoChosen = classeNum.next(); //solicita a resposta do usuário
                    if(_assentoChosen.equals("Y")){ //Se o usuário digitar que sim, chama o método novamente, mas para os assentos da outra classe
                        if(!assentoPrimeiraClasse(false, nome)){  //chama o método novamente para os assentos da outra classe, caso ele retorne false, ele mostra o print na tela
                            System.out.println("O próximo voo parte em 3 horas");
                        };
                    }else{ //Se o usuário não digitar nada, não faça nada
                        continue;
                    }
                }

            }else if(assentoChosen.equals("2")){ //Se escolheu a classe econômica (2)
                boolean occupied = false; //Variável para verificar se o assento foi comprado ou não
                occupied = assentoPrimeiraClasse(false, nome);//Chama o método que realiz a compra do assento
                
                if(!occupied){ //se nenhum assento foi ocupado, ou seja, nenhum assento está disponível, ele pergunta ao usuário se quer comprar outro assento
                    System.out.println("A classe econômica está cheia, deseja comprar um assento na primeira classe? (Y/N)");
                    String _assentoChosen = classeNum.next(); //solicita a resposta do usuário
                    if(_assentoChosen.equals("Y")){ //Se o usuário digitar que sim, chama o método novamente, mas para os assentos da outra classe
                        if(!assentoPrimeiraClasse(true, nome)){  //chama o método novamente para os assentos da outra classe, caso ele retorne false, ele mostra o print na tela
                            System.out.println("O próximo voo parte em 3 horas");
                        };
                    }else{ //Se o usuário não digitar nada, não faça nada
                        continue;
                    }
                }
            }
        }
    }

    //Método que realiza a compra dos assentos
    public static boolean assentoPrimeiraClasse(boolean Actualclass, String nome){ //Declaração do método para comprar os assentos com variável da classe que a pessoa requeriu e o nome do cliente
        if(Actualclass){ //Se a variável da classe for verdadeira, ele realiza a compra da primeira classe
            // System.out.println("Primeira Classe"); //Apenas para verificar no código se entrou no if correto
                for(int i = 0; i < (assentos.length/2); i++){ //percorre os assentos da primeira classe (1-5)
                    if(!(assentos[i])){ //Se o assento estiver false (desocupado) ele ocupa o assento
                        assentos[i] = true; //ocupa o assento atual
                        String j = Integer.toString(i+1); //converte o valor de i para String
                        outputCard(nome, j, "Primeira Classe"); //chama o método outputCard que imprime o cartão de embarque do cliente
                        return true; //retorna verdadeiro
                    }else{
                        continue;
                    }
                }
                return false; //Se nenhum assento estiver disponível, ele retorna false
        }else{
            //System.out.println("Classe Econômica"); //Apenas para verificar no código se entrou no if correto
            for(int i = 5; i < (assentos.length); i++){ //percorre os assentos da classe econômica (6-10)
                if(!(assentos[i])){ //Se o assento estiver false (desocupado) ele ocupa o assento
                    assentos[i] = true; //ocupa o assento atual
                    String j = Integer.toString(i+1); //converte o valor de i para String
                    outputCard(nome, j, "Econônimca"); //chama o método outputCard que imprime o cartão de embarque do cliente
                    return true; //retorna verdadeiro
                }else{
                    continue;
                }
            }
            return false; //Se nenhum assento estiver disponível, ele retorna false
        }
    }

    //Saída do cartão de embarque
    public static void outputCard(String nome, String assento, String classe){ //Declaração do método que imprimi o cartão de embarque do cliente
        System.out.println();
        System.out.println("--------------------------------Cartão de embarque--------------------------------");
        System.out.println("Nome: \t\t" + nome);
        System.out.println("Assento: \t" + assento);
        System.out.println("Classe: \t" + classe);
        System.out.println("Validade: \t" + "12/05/2023");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println();
    }
}