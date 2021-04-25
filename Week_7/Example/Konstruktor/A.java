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
public class A {

    A() {
    } //Konstruktor default, diperlukan hanya agar program dapat
    //dikompilasi

    A(String param1) {
        System.out.println("Konstruktor class A dengan Parameter " + param1 + "dieksekusi ...");
    }
}
