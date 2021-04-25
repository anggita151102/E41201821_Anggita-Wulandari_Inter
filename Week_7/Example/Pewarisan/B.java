/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author Windows 7 PRO
 */
public class B extends A { // Mendeklarasikan Class B yang diturunkan

    int z;                // dari Class A

    void TampilkanJumlah() {
        //subclass dapat mengakses sumber dari superclass
        System.out.println("Jumlah :" + (x + y + z));
    }

}
