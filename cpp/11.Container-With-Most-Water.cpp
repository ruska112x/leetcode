#include <cmath>
#include <cstddef>
#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
 public:
  int maxArea(vector<int>& height) {
    int left = 0;
    int right = height.size() - 1;
    int maxSquare = 0;
    while (left < right) {
      int w = right - left;
      int h = min(height[left], height[right]);
      int square = h * w;
      maxSquare = max(maxSquare, square);
      if (height[left] < height[right]) {
        left++;
      } else if (height[left] > height[right]) {
        right--;
      } else {
        left++;
        right--;
      }
    }
    return maxSquare;
  }
};

int main() {
  Solution solution;
  vector<int> h0 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
  vector<int> h1 = {2, 3, 4, 5, 18, 17, 6};
  cout << solution.maxArea(h0) << "\n";
  return 0;
}
