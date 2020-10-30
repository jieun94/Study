package doit.chap01;

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("단수는 :");
        int n = sc.nextInt();
        spira(n);
    }

    static void spira(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                int num = (i%10)+1;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
