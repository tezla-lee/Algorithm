package _2017팁스타운.예상대진표;

public class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(8, 4, 7));
    }
}
