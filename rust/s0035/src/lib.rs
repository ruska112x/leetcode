pub fn search_insert(nums: Vec<i32>, target: i32) -> i32 {
    let mut result: usize = 0;
    for i in 0..nums.len() {
        if i == 0 {
            if target <= nums[i] {
                result = i;
                break;
            }
        }
        if i == nums.len() - 1 {
            result = nums.len();
            break;
        }
        if nums[i] < target && target <= nums[i + 1] {
            result = i + 1;
            break;
        }
    }
    result as i32
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_search_insert_00() {
        assert_eq!(search_insert(vec![1, 3, 5, 6], 5), 2);
    }

    #[test]
    fn test_search_insert_01() {
        assert_eq!(search_insert(vec![1, 3, 5, 6], 7), 4);
    }
}
