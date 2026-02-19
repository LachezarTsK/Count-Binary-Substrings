
public class Solution {

    public int countBinarySubstrings(String s) {
        int currentCount = 1;
        int previousCount = 0;
        int totalBinarySubstrings = 0;
        char[] binary = s.toCharArray();

        for (int i = 1; i < binary.length; ++i) {
            if (binary[i] == binary[i - 1]) {
                ++currentCount;
            } else {
                totalBinarySubstrings += Math.min(previousCount, currentCount);
                previousCount = currentCount;
                currentCount = 1;
            }
        }
        totalBinarySubstrings += Math.min(previousCount, currentCount);

        return totalBinarySubstrings;
    }
}
