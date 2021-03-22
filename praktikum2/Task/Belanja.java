/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        
        System.out.println("---------------------------------------------");
        System.out.println("     Kharisma Agung Plaza < KAP >    ");
        System.out.println("       Promo Belanja Berhadiah"       );
        System.out.println("   Khusus Pembelian 5 Barang Pertama" );
        System.out.println("    Dengan harga minimum Rp 10000,00" );
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String customer = input.nextLine();
        
        int[] barang = new int[5];
        int Jumlah = 0;
        for (int i = 0; i < barang.length; i++) {
            System.out.print("Masukan harga barang ke-" + (i + 1) + " : ");
            barang[i] = input.nextInt();
            Jumlah = Jumlah + barang[i];
        }
        
              
        System.out.println("Total pembelian atas nama " + customer + " adalah Rp " + Jumlah ); 
        
        boolean Promo = false;
        for (int i = 0; i < barang.length; i++) {
            Promo = barang[i] >= 10000;
        }
        if (Promo == true){       
            System.out.println("\nSelamat...");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik\n");
            System.out.println("---------------------------------------------");
            System.out.println(("                Terima Kasih"             ));
            System.out.println(("Anda sudah berbelanja di Kharisma Agung Plaza"));
        } else {
            System.out.println(("                Terima Kasih"             ));
            System.out.println(("Anda sudah berbelanja di Kharisma Agung Plaza"));
    }
    }
    
}
