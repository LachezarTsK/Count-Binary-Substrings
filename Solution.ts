
function countBinarySubstrings(binary: string): number {
    let currentCount = 1;
    let previousCount = 0;
    let totalBinarySubstrings = 0;

    for (let i = 1; i < binary.length; ++i) {
        if (binary.charAt(i) === binary.charAt(i - 1)) {
            ++currentCount;
        } else {
            totalBinarySubstrings += Math.min(previousCount, currentCount);
            previousCount = currentCount;
            currentCount = 1;
        }
    }
    totalBinarySubstrings += Math.min(previousCount, currentCount);

    return totalBinarySubstrings;
};
