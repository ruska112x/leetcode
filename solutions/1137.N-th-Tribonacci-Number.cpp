#include <iostream>

using namespace std;

class Solution {
public:
    int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        for(int i = 3; i <= n; i++) {
            int tmp2 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tmp2;
        }
        return t2;
    }
};

int main() {
  Solution solution;
  cout << solution.tribonacci(25)
       << "\n";
  return 0;
}