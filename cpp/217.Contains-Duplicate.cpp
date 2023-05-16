#include <iostream>
#include <vector>
#include <set>

using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> s;
        for(auto i : nums) {
            if (s.count(i) != 0) {
                return true;
            }
            s.insert(i);
        }
        return false;
    }
};

int main() {
  Solution solution;
  vector<int> v{1, 2, 3, 1};
  cout << solution.containsDuplicate(v)
       << "\n";
  return 0;
}