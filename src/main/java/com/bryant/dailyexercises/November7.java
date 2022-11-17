package com.bryant.dailyexercises;

import com.bryant.methods.math;

public class November7 {
    public static boolean love6(int a, int b){
        if (a == 6 || b==6){
            return true;
        }
        if (a + b == 6){
            return true;
        }
        if (Math.abs(a-b)==6){
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c){
        if(a==2 && b==2 && c==2){
            return 10;
        }
        if (a==b && a==c){
            return 5;
        } else { return 0; }
    }

    public static void main(String[] args) {
        System.out.println(love6(6,4));
        System.out.println(love6(4,5));
        System.out.println(love6(1,5));

        System.out.println(redTicket(2, 2 ,2));
        System.out.println(redTicket(2, 2 ,1));
        System.out.println(redTicket(0, 0 ,0));
    }}
