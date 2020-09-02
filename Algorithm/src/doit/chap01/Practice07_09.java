package doit.chap01;

import java.util.Scanner;

public class Practice07_09 {
    static int total(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    static int gauss(int num) {
        return (1+num)*(num/2);
    }

    static int sumof(int a, int b) {
        int min;
        int max;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        int sum = 0;
        for (int i = min; i <= max; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(total(5));
        //System.out.println(gauss(100));
        System.out.println(sumof(5, 7));
    }
}
