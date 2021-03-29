/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Windows 7 PRO
 */
public class PerulanganForEach {
    public static void main(String[] args) {
        
        //membuat array
        int angka [] = {3,1,42,24,12};
        
        //menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ) {
            System.out.print(x + " ");
        }
    }
    
}
