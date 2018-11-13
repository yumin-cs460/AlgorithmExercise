/**
 * 283. Move Zeroes
 * @author YUMIN CHEN
 *
 */
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] != 0) {
						int tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;
						break;
					}
				}

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
