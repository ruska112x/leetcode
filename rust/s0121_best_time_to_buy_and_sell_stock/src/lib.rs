pub fn max_profit(prices: Vec<i32>) -> i32 {
    let mut max = 0;
    let mut buy = prices[0];
    for i in 1..prices.len() {
        if prices[i] < buy {
            buy = prices[i];
        } else if prices[i] - buy > max {
            max = prices[i] - buy;
        }
    }
    max
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_max_profit_00() {
        assert_eq!(max_profit(vec![7, 1, 5, 3, 6, 4]), 5);
    }

    #[test]
    fn test_max_profit_01() {
        assert_eq!(max_profit(vec![7, 6, 4, 3, 1]), 0);
    }
}
