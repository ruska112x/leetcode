use std::collections::HashMap;

pub fn majority_element(nums: Vec<i32>) -> i32 {
    let n = (nums.len() as f32 / 2.0).floor() as i32;
    let mut map: HashMap<i32, i32> = HashMap::new();
    let mut result = -1;
    for e in nums {
        let e_count = map.get(&e);
        if e_count.is_none() {
            map.insert(e, 1);
        } else {
            let count = *e_count.unwrap();
            if count > n {
                result = e;
                break;
            }
            map.insert(e, count + 1);
        }
    }
    if result == -1 {
        for k in map.keys() {
            let c = *map.get(&k).unwrap();
            if c > n {
                result = *k;
            }
        }
    }
    return result;
}

#[cfg(test)]
mod tests {
    use super::majority_element;

    #[test]
    fn test_majority_element_00() {
        assert_eq!(majority_element(vec![3, 2, 3]), 3);
    }

    #[test]
    fn test_majority_element_01() {
        assert_eq!(majority_element(vec![2, 2, 1, 1, 1, 2, 2]), 2);
    }
}
