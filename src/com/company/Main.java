package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Testing a commit");

        int[] num = {2,3,5,12,45,67,100,1,9,10};

        System.out.println(Arrays.toString( minmaks(num)));// this will return the position of the max-Value and Min-Value in the Array
    }


    public static int[] minmaks(int[] a){
        int m1 = 0, maxVerdi = a[0];
        int m2 = 0, minVerdi = a[0];


        for (int i = 1; i < a.length; i++) {
            int verdi = a[i];
            if(verdi > maxVerdi) {maxVerdi = verdi; m1 = i;}
            else if (verdi < minVerdi){minVerdi = verdi; m2 = i;}
        }
        return new int[] {m1, m2};
    }

    public static int min(int[] a){
        if(a.length < 1) throw new java.util.NoSuchElementException("Tabell a er tomt");

        int min = 0;
        int minVerdi = a[0];

        for (int i = 1; i < a.length; i++) if(a[i] < minVerdi) {
            min = i;
            minVerdi = a[i];
        }
        return min;
    }

    public static int maks(int[] a){
        if(a.length < 1) throw new java.util.NoSuchElementException("Tabell a er tomt");
        int max = 0;

        for (int i = 1; i < a.length; i++){
            if(a[i] >= a[max])
                max = i;
        }
        return max;
    }

    /**
     * This method will work if we already hav a max and min method
     * @param a
     * @return
     */
    public static int[] maxMin(int [] a){
        if(a.length < 1) throw new java.util.NoSuchElementException("Tabell a er tomt");

        return new int[]{maks(a), min(a)};
    }

//    public static int[] minmaks(int[] a){
//        return new int[]{min(a), maks()};
//    }
}
