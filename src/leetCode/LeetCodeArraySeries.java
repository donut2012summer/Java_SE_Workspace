package leetCode;

import java.util.Arrays;

public class LeetCodeArraySeries {

    public static void main(String[] args){

        // 1.
//        int[] result = twoSum(new int[]{5,5,5,9}, 10);
//        System.out.println(Arrays.toString(result));

        // 2.
//        removeDuplicates(new int[]{1,2,2,3});

        //3.
        removeElement(new int[]{2,2,3,5,6}, 2);




    }

    /*
    * Input: nums = [1,1,2]
    * Output: 2, nums = [1,2,_]
    * Explanation:
    *   Your function should return k = 2,
    *   with the first two elements of nums being 1 and 2 respectively.
    *   It does not matter what you leave beyond the returned k (hence they are underscores).
    * */
    public static int removeDuplicates(int[] nums) {
        // if arr.length == 0, return 0
        if (nums.length == 0)
            return 0;

        // uniqueCount start from 1, at least one unique number in an array
        int uniqueCount = 1;

        // Iterate the arr from the second el
        for (int i = 1; i < nums.length; i++){
            // Compare the current nums with the previous el
            if ( nums[i] != nums[i-1]){

                // nums[0] stores nums[i-1]
                nums[uniqueCount] = nums[i];
                uniqueCount++;

            }
        }
        System.out.println(Arrays.toString(nums));
        return uniqueCount;

    }


    /*
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Explanation:
    *   Because nums[0] + nums[1] == 9, we return [0, 1].
    * @return index of the elements sum up equals target
    * */
    public static int[] twoSum(int[] nums, int target){

        // Iterate the arr, let nums[i] as flag
        for (int i = 0; i < nums.length; i++){

            // Iterate the arr from [i+1] to nums.length
            for(int j = i+1; j < nums.length; j++){
                // if ( nums[i] + nums[j] == target
                if (nums[i]+nums[j] == target){
                    return new int[]{ i, j};
                }

            }
        }

        int[] noResult = { -1, -1};
        return noResult;
    }

    /*
    * Input: nums = [0,1,2,2,3,0,4,2], val = 2
    * Output: 5, nums = [0,1,4,0,3,_,_,_]
    * Explanation:
    *   Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
    *   Note that the five elements can be returned in any order.
    *   It does not matter what you leave beyond the returned k (hence they are underscores).
    * */
    public static int removeElement(int[] nums, int val){

        // remainEl for the index of the arr store the left els
        int remainEl = 0;

        // Iterate the arr
        for ( int i = 0; i < nums.length; i++){

            // If nums[i] != val, nums[remainEl] == nums[i], remainEl++
            if(nums[i] != val){
                nums[remainEl] = nums[i];
                remainEl++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return remainEl;

    }



}
