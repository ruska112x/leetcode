#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Solution {
 public:
  double myPow(double x, int n) {
    if (n == 0 || abs(x - 1) <= 0.000000001) {
      return 1;
    }
    double result = 1;
    if (n > 0) {
      for (size_t i = 0; i < n; i++) {
        result *= x;
      }
    } else {
      for (size_t i = 0; i < abs(n); i++) {
        result *= 1 / x;
      }
    }
    return result;
  }
};

int main() {
  Solution solution;
  cout << solution.myPow(2, -2) << "\n";
  return 0;
}
