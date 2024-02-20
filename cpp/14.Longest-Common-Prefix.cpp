#include <cstddef>
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
    public:
        string longestCommonPrefix(vector<string>& strs) {
            size_t len = strs.at(0).length();
            for (size_t i = 1; i < strs.size(); i++) {
                if (len > strs.at(i).length()) {
                    len = strs.at(i).length();
                }
            }
            string result;
            result.reserve(len);
            for (size_t i = 0; i < len; i++) {
                for (size_t j = 1; j < strs.size(); j++) {
                    if (strs.at(0).at(i) != strs.at(j).at(i)) {
                        return result;
                    }
                }            
                result.push_back(strs.at(0).at(i));
            }
            return result;
        }
};

int main() {
    Solution solution;
    vector<string> strs = {"flower","flow","flight"};
    cout << solution.longestCommonPrefix(strs)
        << "\n";
    return 0;
}

