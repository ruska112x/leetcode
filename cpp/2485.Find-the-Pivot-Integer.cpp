#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int pivotInteger(int n) {
        for(int i = 1; i <= n; ++i) {
            int p = (1+i)*i/2;
            int s = (i+n)*(n-i+1)/2;
            if(s==p) {
                return i;
                }
            }
        return -1;
    }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  Solution solution;
  cout << solution.pivotInteger(8) << "\n";
  return 0;
}
