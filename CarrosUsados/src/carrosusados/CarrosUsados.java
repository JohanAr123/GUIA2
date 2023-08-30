/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrosusados;

import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author FAMILIA ARIAS
 */
public class CarrosUsados {
    JTextArea areaTexto= new JTextArea();
    public CarrosUsados Array[];
    public int modelo;
    public String marca;
    public String color;
    public long kilometraje;  
    public CarrosUsados(int _modelo,String _marca,String _color, long _kilometraje ){
    modelo= _modelo;
    marca= _marca;
    color= _color;
    kilometraje= _kilometraje;
    }
    public void Imp(JTextArea areaTexto){
    areaTexto.append("\nModelo: "+modelo +" Marca: "+marca +" Color: "+color +" Kilometraje: "+kilometraje);
    }
    public int getModelo(){
    
    return modelo;
}
public String getMarca(){
    return marca;
}
public String getColor(){
    return color;
}
public Long getkm(){
    return kilometraje;
}
    public long getKilometraje(){
        return kilometraje;
    }
  
    
public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese el numero de carros: ");
    int n= entrada.nextInt();
    CarrosUsados Array[] = new CarrosUsados[n];
   
   for (int i=0;i<n;i++){
     System.out.println("Ingrese el Modelo: ");
     int modelo= entrada.nextInt();
     System.out.println("Ingrese el Kilometraje:");
     long kilometraje= entrada.nextLong();
     System.out.println("Ingrese el Color: ");
     String color= entrada.next();
     System.out.println("Ingrese la Marca: ");
     String marca= entrada.next();
     Array[i]= new CarrosUsados(modelo,marca,color,kilometraje);
   }
   System.out.println("Arreglo antes de ordenar");
   for (int i=0;i<n;i++){
       
   }
   System.out.println("ORDENAMIENTO:");
   System.out.println("1.MODELO");
   System.out.println("2.KILOMETRAJE");
   System.out.println("Ingrse una opcion:");
   int x=entrada.nextInt();
   switch(x){
       case 1:
       for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
           if(Array[i].getModelo()> Array[j].getModelo()){
               CarrosUsados temp=Array[i];
               Array[i]=Array[j];
               Array[j]=temp;
              
           }
       }
   }
   
   System.out.println("Arreglo despues de ordenar");
   for (int i=0;i<n;i++){
       
   }break;
     case 2:
       for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
           if(Array[i].getKilometraje()> Array[j].getKilometraje()){
               CarrosUsados temp=Array[i];
               Array[i]=Array[j];
               Array[j]=temp;
              
           }
       }
   }
   
   System.out.println("Arreglo despues de ordenar");
   for (int i=0;i<n;i++){
       
         
   }
   break;
}
}


    

}