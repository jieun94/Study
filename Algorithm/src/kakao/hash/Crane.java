package kakao.hash;

import java.util.Stack;

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        //board를 담을 stack 선언
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        //뽑기
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move-1]!=0) {
                    if (stack.peek()==board[i][move-1]) {
                        stack.pop();
                        answer +=2;
                    } else {
                        stack.push(board[i][move-1]);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
