#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        char c = '0';
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            if(s.at(i) == 'I') {
                result += 1;
            }
            if(s.at(i) == 'V') {
                if(c == 'I') {
                    result += 3;
                } else {
                    result += 5;
                }
            }
            if(s.at(i) == 'X') {
                if(c == 'I') {
                    result += 8;
                } else {
                    result += 10;
                }
            }
            if(s.at(i) == 'L') {
                if(c == 'X') {
                    result += 30;
                } else {
                    result += 50;
                }
            }
            if(s.at(i) == 'C') {
                if(c == 'X') {
                    result += 80;
                } else {
                    result += 100;
                }
            }
            if(s.at(i) == 'D') {
                if(c == 'C') {
                    result += 300;
                } else {
                    result += 500;
                }
            }
            if(s.at(i) == 'M') {
                if(c == 'C') {
                    result += 800;
                } else {
                    result += 1000;
                }
            }
            c = s.at(i);
        }
        return result;
    }
};

int main()
{
    std::cout << "Hello World!" << std::endl;
    Solution solution;
    std::cout << solution.romanToInt("MCMXCIV") << "\n"; //1994
    return 0;
}

