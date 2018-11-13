/**
 * 647#Palindromic Substrings
 * @author YUMIN CHEN
 */
public class PalindromicSubstrings {

	public int countSubstrings(String s) {

		char data[] = s.toCharArray();
		int count = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {

				int si = i;
				int sj = j;
				while (true) {
					if (data[sj] != data[si]) {
						break;
					} else if (sj <= si) {
						count++;
						break;
					} else {
						si++;
						sj--;
					}
				}

			}
		}

		count = count + data.length;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
