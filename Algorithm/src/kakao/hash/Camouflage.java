package kakao.hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> hashMap = setCountOfClothes(clothes);
        for (Map.Entry<String, Integer> stringInteger : hashMap.entrySet()) {
            answer *= stringInteger.getValue();
        }
        return answer;
    }

    private HashMap<String, Integer> setCountOfClothes(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];

            if(map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 2);
            }
        }
        return map;
    }
}
