package miniproject.team;

/* * * * * * * * * * * * * * * *
 * Contributed by : 
 * 1. Dhrumil Mistry
 * 
 * * * * * * * * * * * * * * * *
 * for Skill Lab MiniProject
 */

public class EncrypterAndDecrypter {
//	public static String inputText;	
//	
//	void setInputText(String in) {
//		inputText = in;
//	}

	final public static String encrypt(String s, int key) {
		
		//Creating an array to store encrypted chars
		String enc = " ";
		
		for(char i: s.toCharArray()) {
			 i += key;
			 enc += i;
		}
		enc = enc.trim();
		
		return enc;
	}
	
	final public static String decrypt(String s, int key) {
		
		//Creating an array to store encrypted chars
		String denc = " ";
		
		for(char i: s.toCharArray()) {
			 i -= key;
			 denc += i;
		}
		denc = denc.trim();
		return denc;
	}
}