/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller2;

/**
 *
 * @author ASUS TUF
 */
public class ordenar {
    //metodos 
    
    //metodo burbuja 
    
     public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //metodo insercion
    public static void ordInsercion (double [] a)
{
int i, j;
double aux;
for (i = 1; i < a.length; i++)
{
/* indice j es para explorar la sublista a[i-1]..a[0] buscando la
posicion correcta del elemento destino*/
j = i;
aux = a[i];
// se localiza el punto de inserción explorando hacia abajo
while (j > 0 && aux < a[j-1])
{
// desplazar elementos hacia arriba para hacer espacio
a[j] = a[j-1];
j--;
}
a[j] = aux;
}
}

    //metodo seleccion 
     
    public static void ordenarPorSeleccion(double[] arreglo) {
    for (int i = 0; i < arreglo.length - 1; i++) {
        for (int j = i + 1; j < arreglo.length; j++) {
            if (arreglo[i] > arreglo[j]) {
                // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                double temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
            }
        }
    }
}


    
    //metodo mergesort 
     
   public static void merge(double nums[], int left, int m, int right) {
    int n1 = m - left + 1;
    int n2 = right - m;

    double Left_part_arra[] = new double [n1];
    double Right_part_arra[] = new double [n2];

    for (int i = 0; i < n1; ++i)
        Left_part_arra[i] = nums[left + i];
    for (int j = 0; j < n2; ++j)
        Right_part_arra[j] = nums[m + 1 + j];

    int i = 0, j = 0;

    int k = left;
    while (i < n1 && j < n2) {
        if (Left_part_arra[i] <= Right_part_arra[j]) {
            nums[k] = Left_part_arra[i];
            i++;
        } else {
            nums[k] = Right_part_arra[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        nums[k] = Left_part_arra[i];
        i++;
        k++;
    }

    while (j < n2) {
        nums[k] = Right_part_arra[j];
        j++;
        k++;
    }
}

public static void  sort(double nums[], int left, int right) {
    if (left < right) {
        int m = (left + right) / 2;
        sort(nums, left, m);
        sort(nums, m + 1, right);
        merge(nums, left, m, right);
    }
}
}
