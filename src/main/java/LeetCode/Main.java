/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import LeetCode.DS.ListNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author wa1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        isPalindrome(1);
        isValid("(()");
        System.err.println("dvdf = " + lengthOfLongestSubstring("dvdf"));
    }

    public static boolean isPalindrome(int x) {
        int i = 0;
        String number = ("" + x);

        while (i <= number.length() / 2) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i) + "") {
                case "(":
                case "{":
                case "[":
                    //Open hence add
                    stack.add(s.charAt(i) + "");
                    break;
                case ")":

                    //Close hence pop
                    if (stack.isEmpty() || !stack.pop().equals("(")) {
                        return false;
                    }
                    break;
                case "}":
                    //Close hence pop
                    if (stack.isEmpty() || !stack.pop().equals("{")) {
                        return false;
                    }
                    break;
                case "]":
                    //Close hence pop
                    if (stack.isEmpty() || !stack.pop().equals("[")) {
                        return false;
                    }
                    break;
                default:
                    break;

            }
        }
        return stack.isEmpty();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /* Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.*/
        ListNode answer = new ListNode();
        ListNode original = new ListNode();
        original = answer;
        int sum = 0, carry = 0, val = 0, i = 0;
        while (l1 != null || l2 != null) {
            int firstNumber = (l1 != null) ? l1.val : 0;
            int secondNumber = (l2 != null) ? l2.val : 0;
            sum = firstNumber + secondNumber + carry;

            if (sum >= 10) {
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            answer.next = new ListNode(sum);
            answer = answer.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (carry > 0) {
                answer.next = new ListNode(carry);
            }

        }
        return original.next;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int counter = 0, max = 0, seenIndex = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (map.containsKey(s.charAt(i))) {
                counter = 0;
                i = map.get(s.charAt(i)) + 1;
                map.clear();

            }
            counter++;
            map.put(s.charAt(i), (i));

            if (counter > max) {
                max = counter;
            }

        }
        return max;
    }
}
