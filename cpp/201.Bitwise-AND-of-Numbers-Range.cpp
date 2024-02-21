#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  int rangeBitwiseAnd(int left, int right) {
    auto l = bitset<32>(left);
    auto r = bitset<32>(right);

    auto result = bitset<32>(0);

    for (int i = 31; i >= 0; i--) {
      if (l[i] == r[i]) {
        result[i] = l[i];
      } else {
        break;
      }
    }

    return result.to_ulong();
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  Solution solution;
  cout << solution.rangeBitwiseAnd(0, 1) << "\n";
  return 0;
}
