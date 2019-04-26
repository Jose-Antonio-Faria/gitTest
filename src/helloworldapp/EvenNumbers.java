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
public class EvenNumbers {
    public static void printEvenNumber(int i) {
        System.out.println("Even numbers upto "+i);
        for(int x=0;x<i;x=x+2)
            System.out.println(x);
    }
}
