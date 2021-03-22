/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

public class switchCase {
    private static Scanner Scanner;
    
    public static void main(String[] args) {
        String pembeli,menu;
        
        Scanner input = new Scanner (System.in);
        //menampilkan menu awal 
        System.out.println("       CAFE CERIA"    );
        System.out.println("      ANEKA MINUMAN"  );
        System.out.println("----------------------------");
        System.out.println("     1. Soft drinks");
        System.out.println("     2. Mix Juice");
        System.out.println("     3. Nescafe");
        System.out.println("     4. Soda milk");
        System.out.println("     5. Tea");
        System.out.println("---------------------------");
        System.out.print("Masukkan nama pembeli : ");
        pembeli = input.nextLine();
        System.out.println("Silahkan masukkan pilihan anda  : ");
        
        
        menu = input.nextLine();
        switch (menu){
            case "1":    
                System.out.println("Minuman yang anda pesan adalah : Soft drinks");
                break;
            case "2":    
                System.out.println("Minuman yang anda pesan adalah : Mix Juice");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah : Nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah : Soda milk");
                break;
             case "5":
                System.out.println("Minuman yang anda pesan adalah : Tea");
                break;    
            default:
                System.out.println("Mohon pilih dengan benar!");                                                                                           
        }
        
        System.out.println("Pesanan akan segera kami antar");                                        
                System.out.println("Terima Kasih " + pembeli + " telah berkunjung diCafe Ceria");
    
                
    }
    
}
