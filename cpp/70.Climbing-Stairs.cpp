#include <iostream>

using namespace std;

class Solution {
public:
    int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= n; i++)
        {
            int tmp = n1;
            n1 = n2;
            n2 += tmp;
        }
        return n2;
    }
};


int main() {
  Solution solution;
  cout << solution.climbStairs(44)
       << "\n";
  return 0;
}