/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netpay;

/**
 *
 * @author eljam3239
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hours_worked  = 40.0;
        double wage = 5.0;
        double insurance = 2;
        double tax = 0.22;
        double n = (hours_worked*wage-insurance)-tax*(hours_worked*wage);
        System.out.println("The net pay was " + n + " dollars.");
    }
    
}
