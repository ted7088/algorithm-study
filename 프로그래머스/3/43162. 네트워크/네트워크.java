import java.util.Scanner;

class Solution {
    boolean[] visited;
    int[][] computers;
    int n;
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        
        int networkCount = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                networkCount++;
            }
        }
        return networkCount;
    }
    
    void dfs(int idx) {
        visited[idx] = true;
        for (int i = 0; i < n; i++) {
            if (computers[idx][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}