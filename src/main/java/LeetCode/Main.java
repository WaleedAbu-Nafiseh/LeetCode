/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author wa1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.err.println("Values are");

        for (int i = 0; i < nums.length; i++) {
            System.err.println(nums[i]);
        }

        int[] answer = buildArray(nums);
        System.err.println("Answer is ");

        for (int i = 0; i < answer.length; i++) {
            System.err.println(answer[i]);
        }

    }

    public static int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}
