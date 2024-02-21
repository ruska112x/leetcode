#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  bool isPowerOfTwo(int n) {
    if (n > 0) {
      return (n) && !(n & (n - 1));
    } else if (n == -1) {
      return false;
    } else {
      return (n) && !(n & (n + 1));
    }
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  Solution solution;
  cout << solution.isPowerOfTwo(16) << "\n";
  return 0;
}
