/**
 * 268. Missing Number
 * @author YUMIN CHEN
 *
 */
public class MissingNumber {

	 public int missingNumber(int[] nums) {
	        
			int mn = 0;
			for(int i=0; i<nums.length; i++) {
				mn = mn + (i+1);
				mn = mn - nums[i];
			}
			
			return mn;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
