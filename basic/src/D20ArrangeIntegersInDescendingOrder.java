import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String strN = Long.toString(n);
        char[] charArray = strN.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new StringBuilder(new String(charArray)).reverse().toString();
        long answer = Long.parseLong(sortedStr);
        return answer;
    }
}