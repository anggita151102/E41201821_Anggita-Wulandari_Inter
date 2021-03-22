/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        String pembeli;

        Scanner input = new Scanner(System.in);
        int Jumlah = 0;

        
        System.out.println("---------------------------------------------");
        System.out.println("     Kharisma Agung Plaza < KAP >    ");
        System.out.println("       Promo Belanja Berhadiah"       );
        System.out.println("   Khusus Pembelian 5 Barang Pertama" );
        System.out.println("    Dengan harga minimum Rp 10000,00" );
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        pembeli = input.nextLine();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + "      : ");
            Jumlah = Jumlah+ input.nextInt();
        }
        
              
        System.out.println("Total pembelian atas nama " + pembeli + " adalah Rp " + Jumlah ); 
         if (Jumlah > 10000){
        System.out.println("\nSelamat...");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik\n");
         }
        System.out.println("---------------------------------------------");
        System.out.println(("                Terima Kasih"             ));
        System.out.println(("Anda sudah berbelanja di Kharisma Agung Plaza"));
    }
}
