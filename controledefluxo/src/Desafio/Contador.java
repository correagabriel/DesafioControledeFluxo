package Desafio;
import java.util.Scanner;  //SEMPRE LEMBRAR POIS ACOMPANHA O SCANNER

public class Contador {
    public static void main(String[] args) {
    
        try { //O try consegue recuperar erros que possam ocorrer no código fornecido em seu bloco.
            Scanner scanner = new Scanner(System.in);

                System.out.println("Digite um numero : ");
                    int numero1 = scanner.nextInt();

                System.out.println("Digite outro numero : ");
                    int numero2 = scanner.nextInt();

                contarNumero(numero1,numero2); //chamando a função
        
        
        }catch(ParamettrosInvalidos e){ //O catch por sua vez faz o tratamento dos erros que aconteceram.
            System.out.println("Numeros Invalidos"); //CHAMANDO A FUNÇÃO ParamettrosInvalidos
            e.printStackTrace(); //usado para imprimir o nome da classe e numero de linha de exceção
        }

    }
    //Função que vai ser utlizada para mostrar o FOR 
    static void contarNumero(int numero1, int numero2) throws ParamettrosInvalidos{   //throws lança uma exceção mas não exige que ela seja chamada 
        if(numero1 > numero2){
            System.out.println("O numero1 é maior que o numero2");
            throw new ParamettrosInvalidos(); //CHAMANDO A FUNÇAÕ 
        }else{
            for(int numero = numero1; numero <= numero2; ++numero){
                System.out.println("Imprimindo o numero " + numero); //IMPRIMINDO 
            }
        }
    }
}
