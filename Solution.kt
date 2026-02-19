
import kotlin.math.min

class Solution {
    
    fun countBinarySubstrings(binary: String): Int {
        var currentCount = 1
        var previousCount = 0
        var totalBinarySubstrings = 0

        for (i in 1..<binary.length) {
            if (binary[i] == binary[i - 1]) {
                ++currentCount
            } else {
                totalBinarySubstrings += min(previousCount, currentCount)
                previousCount = currentCount
                currentCount = 1
            }
        }
        totalBinarySubstrings += min(previousCount, currentCount)

        return totalBinarySubstrings
    }
}
