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
        int[] nums = {3, 2, 4};
        int[] answer = new int[2];

        answer = twoSum(nums, 6);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int leftOver = target - nums[i];
            if (map.containsKey(leftOver) && map.get(leftOver) != i) {
                answer[0] = map.get(leftOver);
                answer[1] = i;
                break;
            }

        }
        return answer;
    }
}
