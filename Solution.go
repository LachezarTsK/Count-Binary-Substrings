
package main

func countBinarySubstrings(binary string) int {
    currentCount := 1
    previousCount := 0
    totalBinarySubstrings := 0

    for i := 1; i < len(binary); i++ {
        if binary[i] == binary[i - 1] {
            currentCount++
        } else {
            totalBinarySubstrings += min(previousCount, currentCount)
            previousCount = currentCount
            currentCount = 1
        }
    }
    totalBinarySubstrings += min(previousCount, currentCount)

    return totalBinarySubstrings
}
