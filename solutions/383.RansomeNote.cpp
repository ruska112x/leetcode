#include <iostream>

using namespace std;

class Solution {
 public:
  bool canConstruct(string ransomNote, string magazine) {
    string _ransomNote = ransomNote;
    string _magazine = magazine;
    bool result = false;
    size_t index = 0;
    if (_ransomNote.length() <= _magazine.length()) {
      for (char c : _magazine) {
        index = _ransomNote.find(c);
        if (index != string::npos) {
          _ransomNote.replace(index, 1, "");
        }
      }
      if (_ransomNote.empty()) {
        result = true;
      }
    }
    return result;
  }
};

int main() {
  Solution solution;
  cout << solution.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi")
       << "\n";
  return 0;
}
