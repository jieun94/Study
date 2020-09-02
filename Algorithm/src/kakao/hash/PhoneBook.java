package kakao.hash;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = true;
		
		String[] phoneBook = {"119", "97674223", "1195524421"};
		
		for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {answer = false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {answer = false;}
            }
        }
        System.out.println(answer);
	}

}
