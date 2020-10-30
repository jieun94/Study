package doit.chap02;

import java.util.Scanner;

public class Practice04 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수는 : ");
        int num = sc.nextInt();

        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }
        System.out.println("복사");
        int[] a = new int[num];
        copy(a, x);
        System.out.print("a 배열 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("b 배열 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
