/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import javax.swing.JOptionPane;

public class Menampilkan_bilangan_genap {
    public static void main(String[] args) {
        
        String awal = JOptionPane.showInputDialog("Masukkan Batas Nilai Awal = ");
        String akhir = JOptionPane.showInputDialog("Masukkan Batas Nilai Akhir = ");
        int genap = Integer.parseInt(awal);
        int genap1 = Integer.parseInt(akhir);
        
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GENAP");
        System.out.println("-------------------------------------------------");
        System.out.println("Deret Bilangan Genap");
        
            for(int i = genap; i <= genap1; i++)
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
    }
    
}
