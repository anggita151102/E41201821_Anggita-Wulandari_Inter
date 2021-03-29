/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

public class PointB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan jumlah deret : ");
        angka = input.nextInt();

        int[] array = new int[angka];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 70) + 1;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
    
