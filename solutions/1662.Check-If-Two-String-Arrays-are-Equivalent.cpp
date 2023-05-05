#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Solution {
 public:
  bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
    string s1;
    string s2;
    for (auto&& i : word1) {
      s1.append(i);
    }
    for (auto&& i : word2) {
      s2.append(i);
    }
    return s1 == s2;
  }
};

int main() {
  Solution s;
  vector<string> v1;
  v1.push_back("abc");
  v1.push_back("d");
  v1.push_back("defg");
  vector<string> v2;
  v2.push_back("abcddefg");
  cout << s.arrayStringsAreEqual(v1, v2) << "\n";
  return 0;
}