import java.util.HashMap;

/**
 * 13. Roman to Integer
 * @author YUMIN CHEN
 *
 */

public class RomanToInteger {

	HashMap<Character, Integer> rInt = new HashMap<Character, Integer>();

	public RomanToInteger() {
		rInt.put('I', 1);
		rInt.put('V', 5);
		rInt.put('X', 10);
		rInt.put('L', 50);
		rInt.put('C', 100);
		rInt.put('D', 500);
		rInt.put('M', 1000);
	}

	int roInt(char c) {
		return rInt.get(c);
	}

	public int romanToInt(String roman) {
		int sum = 0;
		int length = roman.length();
		int counter = 0;
		for (int i = 0; i < length; i++) {
			int a;

			if (counter == length - 1) {
				sum = sum + roInt(roman.charAt(i));
				// System.out.println(roInt(roman.charAt(i)));
			} else if ((a = roInt(roman.charAt(i))) < roInt(roman.charAt(i + 1))) {
				sum = sum + (0 - a);
			} else {
				sum = sum + roInt(roman.charAt(i));
			}

			counter++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
