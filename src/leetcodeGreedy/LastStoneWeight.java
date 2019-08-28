package leetcodeGreedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * @ClassName: LastStoneWeight
 * @Description: 有一堆石头，每块石头的重量都是正整数。
				每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
				如果 x == y，那么两块石头都会被完全粉碎；
				如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
				最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
				提示：
				1 <= stones.length <= 30
				1 <= stones[i] <= 1000

 * @author author
 * @date 2019-08-28 04:19:25
 */
public class LastStoneWeight {
	public static void main(String[] args) {
		int[] stones = { 1, 2, 3, 4, 5 };
		int result = lastStoneWeight(stones);
		System.out.println(result);
	}

	/**
	 * 
	 * @Title: lastStoneWeight
	 * @Description: 采用优先队列完成（大顶堆）
	 * @param stones
	 * @return
	 * @author author
	 * @date 2019-08-28 04:19:21
	 */
	private static int lastStoneWeight(int[] stones) {
		/* 使用优先对列保证每次能拿到最大的数 */
		Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		for (int i = 0; i < stones.length; i++) {
			queue.offer(stones[i]);
		}

		while (queue.size() > 1) {
			int x = queue.poll();
			int y = queue.poll();
			int diff = Math.abs(x - y);
			if (diff != 0) {
				queue.offer(diff);
			}
		}

		if (queue.isEmpty()) {
			return 0;
		}
		return queue.peek();
	}
}
