import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 1) 고유 종류 수
        Set<Integer> kinds = new HashSet<>();
        for (int n : nums) kinds.add(n);

        // 2) 가져갈 수 있는 최대 마릿수
        int limit = nums.length / 2;

        // 3) 정답: 고유 종류 수와 limit 중 더 작은 값
        return Math.min(kinds.size(), limit);
    }
}