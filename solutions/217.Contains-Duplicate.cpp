#include <iostream>
#include <vector>
#include <set>

using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> s(nums.begin(), nums.end());
        return s.size() != nums.size();
    }
};

int main() {
  Solution solution;
  vector<int> v{1, 2, 3, 1};
  cout << solution.containsDuplicate(v)
       << "\n";
  return 0;
}