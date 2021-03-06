package doit.chap01;

public class Practice04_05 {
    static int med3(int a, int b, int c) {
        if (a >= b) { 
            if (b >= c) { 
                return b; // a>=b && b>=c ===> a >= b >= c
            } else if (a <= c) {
                return a; // a>=b && c>= a ===> c >= a >= b 
            } else {
                return c; // 위를 제외한 나머지 ===> c
            }
        } else if ( a > c) {
            return a; // a<b && a>c ===> b > a > c
        } else if (b > c ) {
            return c; // a<b && b>c 이때 c는 a보다 크다(a>c는 위에서 걸러짐) ===> b > c > a
        } else {
            return b; // 위를 제외한 나머지 ===> b
        }
    }

    
}
