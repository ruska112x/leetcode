#include <bits/stdc++.h>

using namespace std;

template <typename T>
std::ostream& operator<<(std::ostream& os, const std::vector<T>& v) {
  using namespace std;
  copy(v.begin(), v.end(), ostream_iterator<T>(os, "\n"));
  return os;
}

struct ListNode {
  int val;
  ListNode* next;
  ListNode() : val(0), next(nullptr) {}
  ListNode(int x) : val(x), next(nullptr) {}
  ListNode(int x, ListNode* next) : val(x), next(next) {}
};

class Solution {
 public:
  ListNode* removeZeroSumSublists(ListNode* head) {
    ListNode* dummy = new ListNode(0);
    dummy->next = head;
    ListNode* current = dummy;
    while (current != nullptr) {
      ListNode* ptr = current->next;
      int sum = 0;
      while (ptr != nullptr) {
        sum += ptr->val;
        if (sum == 0) {
          current->next = ptr->next;
        }
        ptr = ptr->next;
      }
      current = current->next;
    }
    return dummy->next;
  }
};

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(nullptr);
  ListNode l(1);
  ListNode l1(2);
  ListNode l2(3);
  ListNode l3(-3);
  ListNode l4(-2);
  l3.next = &l4;
  l2.next = &l3;
  l1.next = &l2;
  l.next = &l1;
  Solution solution;
  cout << solution.removeZeroSumSublists(&l)->val << "\n";
  return 0;
}
