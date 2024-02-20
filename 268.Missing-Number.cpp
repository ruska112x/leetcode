#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  int missingNumber(vector<int>& nums) {
    int a_sum = nums.size() * (nums.size() + 1) / 2;
    int sum = accumulate(nums.begin(), nums.end(), 0);
    return a_sum - sum;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  vector<int> v = {9, 6, 4, 2, 3, 5, 7, 0, 1};
  Solution solution;
  cout << solution.missingNumber(v) << "\n";
  return 0;
}
