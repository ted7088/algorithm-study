class Solution {
    public int solution(int num1, int num2) {
        return num1 % num2; // 나머지 연산
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        Solution sol = new Solution(); // 클래스 이름과 동일하게
        System.out.println(sol.solution(3, 2)); // 출력: 1
        System.out.println(sol.solution(10, 5)); // 출력: 0
    }
}