#include <iostream>
#include <set>
#include <string>
#include <vector>

using namespace std;

class Solution {
 public:
  int lengthOfLongestSubstring(string s) {
    set<char> charSet;
    size_t max = 0;
    for (size_t i = 0; i < s.size(); i++) {
      for (size_t j = i; j < s.size(); j++) {
        if (charSet.count(s.at(j)) == 1) {
          charSet.clear();
          break;
        }
        charSet.insert(s.at(j));
        max = max < charSet.size() ? charSet.size() : max;
      }
    }
    return max;
  }
};

int main() {
  Solution solution;
  cout << solution.lengthOfLongestSubstring("abcabcbb") << "\n";
  return 0;
}
