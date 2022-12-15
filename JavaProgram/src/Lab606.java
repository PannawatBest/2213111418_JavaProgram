import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] nums = { 25, 78, 41, 22, 36, 85, 37 };
		int array = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while (checkIndex(nums, array)) {
			array = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		checkIndex(nums, array);
		currentData(nums, array);
		String prevData = (prevData(nums, array)!=-1)?"Previous data, nums ["+ (array - 1) + "] is " + prevData(nums, array):"No previos data";
		String nextData = (nextData(nums, array)!=-1)?"Next data, nums["     + (array + 1) + "] is " + nextData(nums, array):"No next data";
		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + array + "]is " + currentData(nums, array) +
				"\n"+prevData+
				"\n"+nextData);
	}

	public static boolean checkIndex(int[] nums, int index) {
		return (index >= nums.length) ? true : false;
	}

	public static int currentData(int[] nums, int index) {
		return nums[index];
	}

	public static int prevData(int[] nums, int index) {
		return index == 0 ? -1 : nums[index - 1];
	}

	public static int nextData(int[] nums, int index) {
		return index == nums.length-1 ? -1 : nums[index + 1];
	}

}
