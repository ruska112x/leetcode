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
    while (ll1 && ll2) {
      if (!tmp) {
        tmp = new ListNode();
      }
      if (ll1->val + ll2->val + over > 9) {
        tmp->val = (ll1->val + ll2->val + over) % 10;
        over = (ll1->val + ll2->val + over) / 10;
        if (over != 0) {
          tmp->next = new ListNode();
        }
      } else {
        tmp->val = ll1->val + ll2->val + over;
        if (ll1->next && ll2->next) {
          tmp->next = new ListNode();
        }
      }
      tmp = tmp->next;
      ll1 = ll1->next;
      ll2 = ll2->next;
    }
    while (ll1) {
      if (!tmp) {
        tmp = new ListNode();
      }

      tmp->val = (ll1->val + over) % 10;
      over = (ll1->val + over) / 10;
      ll1 = ll1->next;
      if (ll1) {
        tmp = tmp->next = new ListNode();
      }
    }
    while (ll2) {
      if (!tmp) {
        tmp = new ListNode();
      }
      tmp->val = (ll2->val + over) % 10;
      over = (ll2->val + over) / 10;
      ll2 = ll2->next;
      if (ll2) {
        tmp = tmp->next = new ListNode();
      }
    }
    if (tmp && over > 0) {
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
