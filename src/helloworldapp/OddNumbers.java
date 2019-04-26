/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author Ze
 */
public class OddNumbers {
     public static void printOddNumber(int i) {
        System.out.println("Odd numbers upto "+i);
        for(int x=1;x<i;x=x+2)
            System.out.println(x);
    }
}
