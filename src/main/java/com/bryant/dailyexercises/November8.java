package com.bryant.dailyexercises;

public class November8 {
    public int teaParty(int tea, int candy){
        if(tea < 5 || candy < 5)
            return 0;

        if(tea >= 2 * candy || candy >= 2 * tea)
            return 2;

        return 1;
    }

    public static void main(String[] args) {
        November8 nov8 = new November8();

        System.out.println(nov8.teaParty(6, 8));
        System.out.println(nov8.teaParty(3, 8));
        System.out.println(nov8.teaParty(20, 6));
    }
}
