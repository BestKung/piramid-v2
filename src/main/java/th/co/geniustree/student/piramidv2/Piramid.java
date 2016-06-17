/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.student.piramidv2;

import java.util.Scanner;

/**
 *
 * @author best
 */
public class Piramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกจำนวนเเถว : ");
        int height = scanner.nextInt();
        int base = (height * 2) - 1;
        //column
        for (int i = 1; i <= height; i++) {
            //set position
            for (int k = 1; k <= (height - i); k++) {
                System.out.print(" ");
            }
            //row
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
