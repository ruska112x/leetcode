struct Solution;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        use std::collections::HashMap;
        let mut map = HashMap::new();
        let mut result = Vec::new();
        for i in 0..nums.len() {
            let x = nums[i];
            let remainder = target - x;
            let remainder_index = map.get(&remainder);
            match remainder_index {
                Option::None => {
                    map.insert(x, i);
                }
                Option::Some(&j) => {
                    result.push(j as i32);
                    result.push(i as i32);
                    break;
                }
            }
        }
        return result;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_two_sum_00() {
        let result = Solution::two_sum(vec![2, 7, 11, 15], 9);
        let expected = vec![0, 1];
        assert_eq!(result, expected);
    }

    #[test]
    fn test_two_sum_01() {
        let result = Solution::two_sum(vec![3, 2, 4], 6);
        let expected = vec![1, 2];
        assert_eq!(result, expected);
    }
}
