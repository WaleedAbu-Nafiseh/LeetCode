/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

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
        boolean answer = isPalindrome(1);
        System.err.println(isValid("(()"));
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
}
