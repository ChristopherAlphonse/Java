package Leetcode.Array.BaseballGame682;

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> answer = new Stack<>();

        for (String v : operations) {
            switch (v) {
                case "+":
                    // If the operation is "+", add the sum of the last two valid scores to the
                    // stack
                    answer.push(answer.peek() + answer.get(answer.size() - 2));
                    break;
                case "D":
                    // If the operation is "D", double the last valid score and add it to the stack
                    answer.push(2 * answer.peek());
                    break;
                case "C":
                    // If the operation is "C", remove the last valid score from the stack
                    answer.pop();
                    break;
                default:
                    // If it's a number, parse it as an Integer and push it to the stack
                    answer.push(Integer.valueOf(v));
                    break;
            }
        }

        int sum = 0;
        // Iterate over the stack and calculate the sum of all valid scores
        for (int score : answer) {
            sum += score;
        }
        return sum;
    }
}
