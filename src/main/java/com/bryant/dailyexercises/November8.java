package com.bryant.dailyexercises;

public class November8 {
    public int teaParty(int tea, int candy){
        if(tea < 5 || candy < 5)
            return 0;

        if(tea >= 2 * candy || candy >= 2 * tea)
            return 2;

        return 1;
    }

    public int[] post4(int[] nums) {
        int i = nums.length - 1;

        while(nums[i] != 4)
            i--;

        int[] arr = new int[nums.length - i - 1];

        for(int j = 0; j < arr.length; j++)
            arr[j] = nums[i + j + 1];

        return arr;
    }

    public static void main(String[] args) {
        November8 nov8 = new November8();

        System.out.println(nov8.teaParty(6, 8));
        System.out.println(nov8.teaParty(3, 8));
        System.out.println(nov8.teaParty(20, 6));

        int[] test1 = {2,4, 1, 2};
        System.out.println(nov8.post4(test1));
        int[] test2 = {4,1, 4, 2};
        System.out.println(nov8.post4(test2));
        int[] test3 = {4, 4, 1, 2, 3};
        System.out.println(nov8.post4(test3));
    }

}
