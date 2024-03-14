#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  int numSubarraysWithSum(vector<int>& nums, int goal) {
    int result = 0;
    int sum = 0;
    unordered_map<int, int> freq;

    for (int n : nums) {
      sum += n;
      if (sum == goal) {
        ++result;
      }

      if (freq.find(sum - goal) != freq.end()) {
        result += freq[sum - goal];
      }

      freq[sum]++;
    }

    return result;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  vector<int> v = {1, 0, 1, 0, 1};
  Solution solution;
  cout << solution.numSubarraysWithSum(v, 2) << "\n";
  return 0;
}
