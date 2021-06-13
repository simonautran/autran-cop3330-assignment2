/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Simon Autran
*/

package ex26;
public class PaymentCalculator {
public static double PaymentCalculator(double balance, double apr, double monthPayment){
        double round = balance / monthPayment;
        round = Math.ceil(round * 100);
        round = round / 100;
        double monthcount = Math.log(1 + (round) * (1 - Math.pow(1 + apr, 30)));
        monthcount = monthcount * (-1/30);
        monthcount = monthcount / Math.log(1 + apr);
        monthcount = Math.ceil(monthcount);
        return monthcount;
