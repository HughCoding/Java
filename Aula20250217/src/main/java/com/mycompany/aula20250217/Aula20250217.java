package com.mycompany.aula20250217;
import java.io.IOException;
import java.util.Scanner;

public class Aula20250217 {

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 5;
        int resultado = 0;
        
        while(true){
        System.out.printf("=======================================\n");
        System.out.printf("\t\t %s \n", "CALCULADORA");
        System.out.printf("=======================================\n");
        System.out.println("\t[1] Adição (+)");
        System.out.println("\t[2] Subtração (-)");
        System.out.println("\t[3] Multiplicação (*)");
        System.out.println("\t[4] Divisão (/)");
        System.out.println("\t[0] Sair");
        System.out.printf("=======================================\n");
        System.out.printf("Escolha uma opção: ");
            
     
        opcao = scanner.nextInt();
        
       switch(opcao){
           case 0:
            System.out.println("Saindo da calculadora... ");
           case 1:
            System.out.println("Opção válida! Você escolheu a opção: " + opcao);
            break;
           case 2:
            System.out.println("Opção válida! Você escolheu a opção: " + opcao);
            break;
           case 3:
            System.out.println("Opção válida! Você escolheu a opção: " + opcao);
            break;
           case 4:
            System.out.println("Opção válida! Você escolheu a opção: " + opcao);
            break;
           default:
            System.out.println("Opçâo invalida");
            break;
                   
       }
        
       System.out.println("Escolha o primeiro número:");
       int num1 = scanner.nextInt();
       System.out.println("Escolha o segundo número:");
       int num2 = scanner.nextInt();
      
       
       
       
       if(opcao == 1) {
           resultado = num1 + num2;
       } else if(opcao == 2) {
           resultado = num1 - num2;
       } else if(opcao == 3) {
           resultado = num1 * num2;
       } else if(opcao == 4){ 
           if (num2 != 0) {
           resultado = num1 / num2;
       } else{
           System.out.println("Numero Invalido");
       }
       }
        System.out.println("Resultado:" + resultado);

        
    }
   
}
}
