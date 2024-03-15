#include <bits/stdc++.h>

using namespace std;

template <typename T>
std::ostream& operator<<(std::ostream& os, const std::vector<T>& v) {
  using namespace std;
  copy(v.begin(), v.end(), ostream_iterator<T>(os, "\n"));
  return os;
}

class Solution {
 public:
  vector<int> productExceptSelf(vector<int>& nums) {
    vector<int> suffix(nums.size(), 1);
    vector<int> prefix(nums.size(), 1);
    partial_sum(nums.cbegin(), nums.cend(), prefix.begin(), multiplies<int>());
    partial_sum(nums.crbegin(), nums.crend(), suffix.begin(),
                multiplies<int>());

    vector<int> result(nums.size(), 1);
    for (int i = 0; i < nums.size(); i++) {
      if (i == 0) {
        result[i] *= suffix[nums.size() - 2 - i];
      } else if (i == nums.size() - 1) {
        result[i] *= prefix[i - 1];
      } else {
        result[i] *= suffix[nums.size() - 2 - i] * prefix[i - 1];
      }
    }

    return result;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  vector<int> v0 = {1, 2, 3, 4};
  Solution solution;
  cout << solution.productExceptSelf(v0) << "\n";
  return 0;
}
