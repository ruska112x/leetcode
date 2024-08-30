pub fn find_median_sorted_arrays(nums1: Vec<i32>, nums2: Vec<i32>) -> f64 {
    let mut i = 0;
    let mut j = 0;
    let s = nums1.len() + nums2.len();
    let mut arr = vec![];
    while i < nums1.len() && j < nums2.len() {
        if nums1[i] < nums2[j] {
            arr.push(nums1[i]);
            i += 1;
        } else {
            arr.push(nums2[j]);
            j += 1;
        }
    }
    while i < nums1.len() {
        arr.push(nums1[i]);
        i += 1;
    }
    while j < nums2.len() {
        arr.push(nums2[j]);
        j += 1;
    }
    return if s % 2 == 0 {
        (arr[(s / 2) - 1] + arr[s / 2]) as f64 / 2.0_f64
    } else {
        arr[s / 2] as f64
    };
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_find_median_sorted_arrays_00() {
        assert_eq!(find_median_sorted_arrays(vec![1, 2], vec![3]), 2.0_f64);
    }

    #[test]
    fn test_find_median_sorted_arrays_01() {
        assert_eq!(find_median_sorted_arrays(vec![1, 2, 4], vec![3]), 2.5_f64);
    }
}
