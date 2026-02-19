
#include <string>
#include <algorithm>
using namespace std;

class Solution {

public:
    int countBinarySubstrings(string binary) {
        int currentCount = 1;
        int previousCount = 0;
        int totalBinarySubstrings = 0;

        for (int i = 1; i < binary.length(); ++i) {
            if (binary[i] == binary[i - 1]) {
                ++currentCount;
            }
            else {
                totalBinarySubstrings += min(previousCount, currentCount);
                previousCount = currentCount;
                currentCount = 1;
            }
        }
        totalBinarySubstrings += min(previousCount, currentCount);

        return totalBinarySubstrings;
    }
};
