package doit.chap01;

import java.util.Scanner;

class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int n = sc.nextInt();

        if (n>0) {
            System.out.println("양수");
        } else if (n<0) {
            System.out.println("음수");
        }else{
            System.out.println("0입니다.");
        }
    }
}
