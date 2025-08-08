
class Solution {
public:
    bool isPalindrome(int x) {
        // Negative numbers are never palindrome
        if (x < 0) {
            return false;
        }

        long long revNum = 0; // use long long to avoid overflow
        int n = x;

        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n /= 10;
        }

        return revNum == x; // directly return comparison result
    }
};