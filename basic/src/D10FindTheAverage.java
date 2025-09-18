class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        double average = 0;
        for (int number : arr){
            sum += number;
        }
        average = sum / (arr.length);
        return average;
    }
}