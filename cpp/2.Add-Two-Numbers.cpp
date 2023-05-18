#include <ctime>
#include <iostream>
#include <ostream>
#include <string>
#include <vector>

using namespace std;

struct ListNode {
  int val;
  ListNode* next;
  ListNode() : val(0), next(nullptr) {}
  ListNode(int x) : val(x), next(nullptr) {}
  ListNode(int x, ListNode* next) : val(x), next(next) {}
};

ostream& operator<<(ostream& os, ListNode& node) {
  ListNode* tmp = &node;
  while (tmp) {
    os << tmp->val << ", ";
    tmp = tmp->next;
  }
  return os;
}

class Solution {
 public:
  ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    ListNode* sum = new ListNode();
    ListNode* tmp = sum;
    int over = 0;
    ListNode* ll1 = l1;
    ListNode* ll2 = l2;
    while (ll1) {
      tmp->val = ll1->val;
      ll1 = ll1->next;
      if (ll1) {
        tmp->next = new ListNode();
      }
      tmp = tmp->next;
    }
    tmp = sum;
    while (ll2) {
      tmp->val += ll2->val;
      ll2 = ll2->next;
      if (ll2 && !tmp->next) {
        tmp->next = new ListNode();
      }
      tmp = tmp->next;
    }
    tmp = sum;
    while (tmp) {
      if (tmp->val + over > 9) {
        tmp->val += over;
        over = tmp->val / 10;
        tmp->val %= 10;
      } else {
        tmp->val += over;
        over = tmp->val / 10;
      }
      if (tmp->next) {
        tmp = tmp->next;
      } else {
        break;
      }
    }
    if (over > 0) {
      tmp->next = new ListNode(over);
    }
    return sum;
  }
};

int main() {
  Solution solution;

  ListNode* l1 = new ListNode(9);
  l1->next = new ListNode(9);
  l1->next->next = new ListNode(9);
  l1->next->next->next = new ListNode(9);
  l1->next->next->next->next = new ListNode(9);
  l1->next->next->next->next->next = new ListNode(9);
  l1->next->next->next->next->next->next = new ListNode(9);
  ListNode* l2 = new ListNode(9);
  l2->next = new ListNode(9);
  l2->next->next = new ListNode(9);
  l2->next->next->next = new ListNode(9);

  cout << *solution.addTwoNumbers(l1, l2) << "\n";

  return 0;
}
