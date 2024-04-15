import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < intervals.length; ++i) {
      System.out.println("");
    }
    int res[][] = new int[list.size()][2];
    for (int i = 0; i < list.size(); ++i) {
      res[i] = list.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println("Hello!");
    int[][] a = {{1, 2}, {5, 6}, {7, 8}};
    int[] n = {3, 4};
    Solution s = new Solution();
    int[][] result = s.insert(a, n);
    for (int[] e : result) {
      System.out.println(Arrays.toString(e));
    }
  }
}

