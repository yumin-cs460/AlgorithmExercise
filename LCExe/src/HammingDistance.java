/**
 * #461
 * Hamming Distance
 * @author YUMIN CHEN
 */
public class HammingDistance {

	public int hammingDistance(int n1, int n2) {

		int[] binaryA = new int[32];
		int[] binaryB = new int[32];

		int index = 0;
		while (n1 > 0) {
			binaryA[index++] = n1 % 2;
			n1 = n1 / 2;
		}

		index = 0;
		while (n2 > 0) {
			binaryB[index++] = n2 % 2;
			n2 = n2 / 2;
		}

		int sum = 0;
		for (int i = 0; i < 32; i++) {
			if (binaryA[i] == binaryB[i]) {
				sum++;
			}
		}
		return 32 - sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
