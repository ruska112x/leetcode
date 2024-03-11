#include <bits/stdc++.h>

using namespace std;

class Solution {
 public:
  string customSortString(string order, string s) {
    string not_in_order;
    map<char, int> freq_map;
    for (auto&& c : s) {
      if (order.find(c) != order.npos) {
        auto it = freq_map.find(c);
        if (it == freq_map.end()) {
          freq_map.insert(make_pair(c, 1));
        } else {
          ++(it->second);
        }
      } else {
        not_in_order.push_back(c);
      }
    }
    string result;
    for (auto&& c : order) {
      auto it = freq_map.find(c);
      string rep(it->second, it->first);
      result.append(rep);
    }
    result.append(not_in_order);
    return result;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  Solution solution;
  cout << solution.customSortString("cba", "abcd") << "\n";
  return 0;
}
