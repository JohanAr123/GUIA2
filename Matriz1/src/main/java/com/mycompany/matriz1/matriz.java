/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matriz1;

import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class matriz {
      // metodos :
    public static void SumarMatriz(int a ,int b) throws InterruptedException{
       float [][] matriz1 = new float [a][b];
        float [][] matriz2 = new float [a][b];
        float [][] matrizr = new float [a][b];
    //funcion para lectura de variables
    Scanner entrada=new Scanner (System.in);
         // LLENAMOS LAS matrices
         int z;
             for(int i=0;i<a;i++ )
             {
                for(int j=0 ; j<b;j++)
                {
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             z=1;
                    System.out.println(("matriz ")+z+" ingrese el numero de la posicion "+ (i+1) + "x" +(j+1) );
                     matriz1[i][j]= entrada.nextInt();
                }
             }
             
             // LLENAMOS LA MATRIZ2
             for(int i=0;i<a;i++ )
             {
                for(int j=0 ; j<b;j++)
                {
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             z=2;
                    System.out.println(("matriz ")+z+" ingrese el numero de la posicion "+ (i+1) + "x" +(j+1) );
                     matriz2[i][j]= entrada.nextInt();
                }
             }
              // LLENAMOS LA MATRIZ Resultado
             for(int i=0;i<a;i++ )
             {
                for(int j=0 ; j<b;j++)
                {
                     matrizr[i][j]=  matriz1[i][j]+ matriz2[i][j];
                }
             }
             for(int n=0;n<30;n++){
                 System.out.println("");
             }
             
             System.out.println("La Matriz resultante de la suma de la matriz 1 y matriz 2 es: ");
             //mostrar la matriz : 
             for(int i=0;i<a;i++ )
             {
                 System.out.print("| ");
                for(int j=0 ; j<b;j++)
                {
                    System.out.print(matrizr[i][j]+(" "));
                }
                System.out.print("|");
                System.out.println("");
             }
            Thread.sleep(5000);
    }
    public static void multmatriz(int a , int b) throws InterruptedException {
       float [][] matriz1 = new float [a][b];
        float [][] matriz2 = new float [b][a];
        Scanner entrada=new Scanner (System.in);
         // LLENAMOS LAS matrices
         int z;
             for(int i=0;i<a;i++ )
             {
                for(int j=0 ; j<b;j++)
                {
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             z=1;
                    System.out.println(("matriz ")+z+" ingrese el numero de la posicion "+ (i+1) + "x" +(j+1) );
                     matriz1[i][j]= entrada.nextInt();
                }
             }
             
             // LLENAMOS LA MATRIZ2
             for(int i=0;i<b;i++ )
             {
                for(int j=0 ; j<a;j++)
                {
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             z=2;
                    System.out.println(("matriz ")+z+" ingrese el numero de la posicion "+ (i+1) + "x" +(j+1) );
                     matriz2[i][j]= entrada.nextInt();
                }
             }
        int filasA = matriz1.length;
        int columnasA = matriz1[0].length;
        int columnasB = matriz2[0].length;

        int[][] matrizResultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int sum = 0;
                for (int k = 0; k < columnasA; k++) {
                    sum += matriz1[i][k] * matriz2[k][j];
                }
                matrizResultado[i][j] = sum;
            }
        }

        //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             
             System.out.println("La Matriz resultante del producto de la matriz 1 y matriz 2 es: ");
        // Imprimir la matriz resultado
        for (int i = 0; i < filasA; i++) {
            System.out.print("| ");
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        Thread.sleep(5000);
    }
    
    public static void escalarmatriz(int a,int b,float c) throws InterruptedException{
        float [][] matriz1 = new float [a][b];
        
        Scanner entrada=new Scanner (System.in);
         // LLENAMOS LAS matrices
         int z;
             for(int i=0;i<a;i++ )
             {
                for(int j=0 ; j<b;j++)
                {
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             z=1;
                    System.out.println(("matriz ")+z+" ingrese el numero de la posicion "+ (i+1) + "x" +(j+1) );
                     matriz1[i][j]= entrada.nextInt();
                }
             }
             
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             System.out.println("La Matriz resultante del producto escalar "+c +" por la matriz 1 es :");
        // Imprimir la matriz resultado
        for (int i = 0; i < a; i++) {
            System.out.print("| ");
            for (int j = 0; j < b; j++) {
                System.out.print(c*matriz1[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
             
             Thread.sleep(5000);
    }
    
    public static void transmatriz(int a,int b) throws InterruptedException{
        float [][] matriz1 = new float [a][b];
        float [][] matrizr = new float [b][a];
        Scanner entrada=new Scanner (System.in);
         // LLENAMOS LAS matrices
         int z;
             for(int i=0;i<a;i++ )
             {
                for(int j=0 ; j<b;j++)
                {
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             z=1;
                    System.out.println(("matriz ")+z+" ingrese el numero de la posicion "+ (i+1) + "x" +(j+1) );
                     matriz1[i][j]= entrada.nextInt();
                }
             }
             
             // LLENAMOS LA MATRIZr
             for(int i=0;i<b;i++ )
             {
                for(int j=0 ; j<a;j++)
                {
                 matrizr[i][j] = matriz1[j][i];
                }
             }
             
             //limpiamos la consola
             for(int o=0; o<30 ; o++){
             System.out.println("");
             }
             System.out.println("La Matriz transpuesta de la matriz 1 es :");
        // Imprimir la matriz resultado
            for (int i = 0; i < b; i++) {
                System.out.print("| ");
            for (int j = 0; j < a; j++) {
                System.out.print(matrizr[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
             
             Thread.sleep(5000);
             
    }
}
