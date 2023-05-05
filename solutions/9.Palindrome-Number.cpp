#include <iostream>

using namespace std;

class Solution {
 public:
  bool isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    auto str = to_string(x);
    for (int i = 0; i < str.length(); ++i) {
      if (str[i] != str[str.length() - i - 1]) {
        return false;
      }
    }
    return true;
  }
};

int main() {
  Solution solution;
  cout << solution.isPalindrome(123321) << "\n";
  return 0;
}
