
using System;

public class Solution
{
    public int CountBinarySubstrings(string binary)
    {
        int currentCount = 1;
        int previousCount = 0;
        int totalBinarySubstrings = 0;

        for (int i = 1; i < binary.Length; ++i)
        {
            if (binary[i] == binary[i - 1])
            {
                ++currentCount;
            }
            else
            {
                totalBinarySubstrings += Math.Min(previousCount, currentCount);
                previousCount = currentCount;
                currentCount = 1;
            }
        }
        totalBinarySubstrings += Math.Min(previousCount, currentCount);

        return totalBinarySubstrings;
    }
}
