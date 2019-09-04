package leetcodeDp;

public class MinCostClimbingStairs {
	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int costMin = minCostClimbingStairs(cost);
		System.out.println(costMin);
	}

	private static int minCostClimbingStairs(int[] cost) {
		if (cost.length == 0) {
			return 0;
		}
		int[] dp = new int[cost.length];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
		}
		return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
	}

}
