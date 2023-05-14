#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        size_t len = strs.at(0).length();
        for (size_t i = 1; i < strs.size(); i++)
        {
            if (len > strs.at(i).length()) {
                len = strs.at(i).length();
            }
        }
        for (string str : strs)
        {
            
        }
        
    }
};

int main() {
    Solution solution;
    vector<string> strs = {"flower","flow","flight"};
  cout << solution.longestCommonPrefix(strs)
       << "\n";
  return 0;
}

