/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

public class PointC {
    public static void main(String[] args) {
        int maksimum, minimum, jumlah, i, array[];
        int rata = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan banyaknya data nilai : ");
        jumlah = scan.nextInt();
        array = new int[jumlah];
        
    for(i = 0; i < jumlah; i++ ) {
        System.out.print("Masukkan data nilai ke-" + (i+1) + " : ");
        array[i] = scan.nextInt();
    }        
    maksimum = array[0];
    minimum = array[0];
    rata = maksimum - minimum;
    
    for(i = 0; i < jumlah; i++) {
        if (array[i] > maksimum) {
            maksimum = array[i];
        }
        else if(array[i] < minimum){
            minimum = array[i];
        }
    }
    for (int tambah : array) {
        rata = rata+tambah/jumlah; }
    
    System.out.println("\nNilai minimum adalah " + minimum);
    System.out.println("Nilai maksimum adalah " + maksimum);
    System.out.println("Nilai rata ratanya adalah " + rata);  
    }    
    
}
