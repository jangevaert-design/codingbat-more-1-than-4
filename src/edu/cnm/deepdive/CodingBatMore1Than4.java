package edu.cnm.deepdive;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

public class CodingBatMore1Than4 {

  private static int[] one = {1, 4, 1};
  private static int[] two = {1, 4, 1, 4};
  private static int[] three = {1, 1};

  public static void main(String[] args) {

    System.out.println("Given the array [1, 4, 1], the outcome will be " + more14(one) + ".");
    System.out.println("Given the array [1, 4, 1, 4], the outcome will be " + more14(two) + ".");
    System.out.println("Given the array [1, 1], the outcome will be " + more14(three) + ".");
  }

  public static boolean more14(int[] nums) {
    int count1 = 0;
    int count4 = 0;
    int len = nums.length;

    for (int i = 0; i < len; i++) {
      if (nums[i] == 1) {
        count1++;
      }
      if (nums[i] == 4) {
        count4++;
      }
    }
    return (count1 > count4);
  }

}
