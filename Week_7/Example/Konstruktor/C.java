/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author Windows 7 PRO
 */
public class C extends B {

    C() { //super(); Tambahan kode secara otomatis oleh Java untuk memanggil
        //         Konstruktor dari SuperClassnya
        super(); // Konstruktor default dari class B
        //  Object dipanggil
        System.out.println("Konstruktor class C dieksekusi ...");
    }

}
