#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  int findJudge(int n, vector<vector<int>>& trust) {
    set<int> l;
    set<int> r;
    if (n == 2) {
      return trust[0][1];
    }
    for (auto&& i : trust) {
      l.insert(i[0]);
      r.insert(i[1]);
    }
    for (auto&& i : l) {
      if (r.find(i) != r.end()) {
        r.erase(i);
      }
    }
    if (r.size() != 1) {
      return *r.begin();
    } else {
      return -1;
    }
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  vector<vector<int>> vv{{1, 2}, {2, 3}};
  Solution solution;
  cout << solution.findJudge(3, vv) << "\n";
  return 0;
}
