/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author Windows 7 PRO
 */
public class DeretBilangan {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int angka1=0,angka2=1,deret,hasil;
     
     
        System.out.println("Masukkan bilangan: ");
        deret = input.nextInt();
     
        if (deret>2){
        for(int i=0;i<deret;i++){
            hasil=angka1+angka2;
            angka1=angka2;
            angka2=hasil;
            System.out.print(hasil);
            System.out.print(" , ");
        }
        }else{
            System.out.println("Deret kurang dari 2");
        }
    }
 
}
    

