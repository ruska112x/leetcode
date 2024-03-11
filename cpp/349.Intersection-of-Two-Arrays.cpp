#include <bits/stdc++.h>

using namespace std;

template<typename T>
std::ostream &operator <<(std::ostream &os, const std::vector<T> &v) {
   using namespace std;
   copy(v.begin(), v.end(), ostream_iterator<T>(os, "\n"));
   return os;
}

class Solution {
 public:
  vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
    set<int> s1(nums1.begin(), nums1.end());
    set<int> s2(nums2.begin(), nums2.end());
    vector<int> result;
    set<int>::iterator it;
    set<int>::iterator end;
    if (s1.size() < s2.size()) {
      it = s1.begin();
      while (it != s1.end()) {
        set<int>::iterator f = s2.find(*it);
        if (f != s2.end()) {
          result.push_back(*it);
        }
        it++;
      }
    } else {
      it = s2.begin();
      while (it != s2.end()) {
        set<int>::iterator f = s1.find(*it);
        if (f != s1.end()) {
          result.push_back(*it);
        }
        it++;
      }
    }
    return result;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  vector<int> v0 = {1, 2, 2, 1};
  vector<int> v1 = {2, 2};
  Solution solution;
  cout << solution.intersection(v0, v1) << "\n";
  return 0;
}
