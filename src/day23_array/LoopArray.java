package day23_array;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {

        int[] nums = {4, 213, 6};

        //print whole array
        System.out.println(Arrays.toString(nums));

        // print each on a separate line hard coded index
        System.out.println("Hardcoded");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        //printing each with for loop
        System.out.println("With the loop");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[1]);
        }
        // create our own printing format
        System.out.println("our own format");
        String arrayString = "Array ~ ";
        for (int i = 0; i < nums.length; i++) {
            arrayString += nums[i] + " | ";
        }
        arrayString += "~ END";
        System.out.println(arrayString);

        // got through with for each loop
        System.out.println("For each loop");

        for (int eachNumber : nums){ // read every element from the array, beginning to the end
            System.out.println(eachNumber); // each number == nums[i] --> these are the same
        }
    }
}
