package kakao.hash;

import java.util.*;

public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] participant = {"leo", "kiki", "eden"};
		//String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		
		//String[] completion = {"eden", "kiki"};
		//String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
    	//참가자 배열을 hashmap에 넣으면서 value +1
        
        for (String player : completion) {
        	hm.put(player, hm.get(player) - 1);
        }
        //완주자 배열에 있는 값을 hashmap에서 찾은 뒤 value를 -1한다.
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        //hashmap value가 0이 아닌 key를  answer에 입력
        
        System.out.println(answer);
	}

}
