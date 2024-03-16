#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  int findMaxLength(vector<int>& nums) {
    int n = nums.size(), pref = 0, len = 0;
    for (int i = 0; i < n; ++i) {
      if (nums[i] == 0) {
        nums[i] = -1;
      }
    }
    unordered_map<int, int> pref_indx;
    pref_indx[0] = -1;
    for (int i = 0; i < n; ++i) {
      pref += nums[i];
      if (pref_indx.find(pref) != pref_indx.end()) {
        len = max(len, i - pref_indx[pref]);
      } else {
        pref_indx[pref] = i;
      }
    }
    return len;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  vector<int> v0 = {0, 0, 1, 0, 0, 1, 1};
  Solution solution;
  cout << solution.findMaxLength(v0) << "\n";
  return 0;
}
