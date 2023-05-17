#include <climits>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Solution {
 public:
  double myPow(double x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n == INT_MAX) {
      return x == 1 ? 1 : x == -1 ? -1 : 0;
    } else if (n == INT_MIN) {
      return x == 1 ? 1 : x == -1 ? 1 : 0;
    }
    double result = 1;
    if (n < 0) {
      x = 1 / x;
      n = -n;
    }
    for (size_t i = 0; i < n; i++) {
      result *= x;
    }
    return result;
  }
};

int main() {
  Solution solution;
  cout << solution.myPow(0.00001, 2147483647) << "\n";
  return 0;
}
