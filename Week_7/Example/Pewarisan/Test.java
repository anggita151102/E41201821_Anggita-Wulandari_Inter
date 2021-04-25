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
public class Test {
    public static void main (String[] args) {
        Pelajar mahasiswa = new Pelajar("Lukman", 172, 75,
                "1010651098", "UM JEMBER", 98.8);
        System.out.println(mahasiswa.toString());
    }
}
