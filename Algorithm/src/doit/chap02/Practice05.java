package doit.chap02;

import java.util.Scanner;

public class Practice05 {
    static void rcopy(int[] a , int[] b) {
        //b열을 a열에 역순으로 복사
        for (int i = 0; i < b.length; i++) {
            a[i] = b[b.length-i-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수는 : ");
        int num = sc.nextInt();

        int[] b = new int[num];
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("b["+i+"] : ");
            b[i] = sc.nextInt();
        }

        rcopy(a, b);
        System.out.print("b열 : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
        System.out.print("a열 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
