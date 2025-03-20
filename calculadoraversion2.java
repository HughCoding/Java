package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {
    public static int somar(int n1, int n2){
        return n1 + n2;
}
    
    public static int  subtrair(int n1, int n2){
        return n1 - n2;
    }
    
     public static int  multiplicar(int n1, int n2){
        return n1 * n2;
    }
    
     public static int  dividir(int n1, int n2){
       if (n2 == 0) {
          System.out.println("Erro. Divisão por 0");
       }
       return n1 / n2;
    }
    
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        int opcao;

       while(true){
            System.out.printf("=======================================\n");
            System.out.printf("\t\t %s \n", "CALCULADORA");
            System.out.printf("=======================================\n");
            System.out.println("\t[1] Adicao (+)");
            System.out.println("\t[2] Subtracao (-)");
            System.out.println("\t[3] Multiplicacao (*)");
            System.out.println("\t[4] Divisao (/)");
            System.out.println("\t[0] Sair");
            System.out.printf("=======================================\n");
            
            System.out.printf("Escolha uma opcao: ");
            opcao = scanner.nextInt(); 
            int n1 = 0, n2 = 0;
            
            if(opcao == 0){
             System.out.println("Saindo da calculadora... ");
             break;
         }
                         
            if (opcao != 0){
                System.out.println("Escolha o primeiro número: ");
                 n1 = scanner.nextInt();
                
                System.out.println("Escolha o primeiro número: ");
                 n2 = scanner.nextInt();
            }
            
            
            switch(opcao){
           case 1 -> System.out.println("Resultado: " + somar(n1, n2));
           case 2 -> System.out.println("Resultado: " + subtrair(n1, n2));
           case 3 -> System.out.println("Resultado: " + multiplicar(n1, n2));
           case 4 -> System.out.println("Resultado: " + dividir(n1, n2));
           default -> System.out.println("Resultado:");
           
         }
            
            scanner.close();
            
       }
    }
}