package doit.chap02;

import java.util.Random;

public class Practice01 {
    
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rd = new Random();

        //사람의 수를 난수로 설정
        int num = rd.nextInt(10);

        System.out.println("키의 최댓값 구하기");
        System.out.println("사람 수 : "+num);
        
        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rd.nextInt(90);
            System.out.println("height["+i+"] :"+ height[i]);
        }

        System.out.println("최댓값은 "+maxOf(height)+"입니다.");
    }
}
