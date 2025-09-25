import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        //int[] answer = {};
        String numberStr = String.valueOf(n);
        int length = numberStr.length();
        StringBuilder stringBuilder = new StringBuilder(numberStr);
        String reversedString = stringBuilder.reverse().toString();
        String[] newArray = reversedString.split("");
        int[] answer = Arrays.stream(newArray).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}