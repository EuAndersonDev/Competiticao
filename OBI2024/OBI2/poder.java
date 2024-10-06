import java.util.Scanner;

public class poder {
    private static int[][] matrix;
    private static int[][] maxPower;
    private static boolean[][] visited;
    private static int N, M;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        matrix = new int[N][M];
        maxPower = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(maxPower[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int dfs(int i, int j) {
        if (visited[i][j]) {
            return maxPower[i][j];
        }

        visited[i][j] = true;
        int power = matrix[i][j];
        int max = power;

        // Move up
        if (i > 0 && power >= matrix[i - 1][j]) {
            max = Math.max(max, power + dfs(i - 1, j));
        }
        // Move down
        if (i < N - 1 && power >= matrix[i + 1][j]) {
            max = Math.max(max, power + dfs(i + 1, j));
        }
        // Move left
        if (j > 0 && power >= matrix[i][j - 1]) {
            max = Math.max(max, power + dfs(i, j - 1));
        }
        // Move right
        if (j < M - 1 && power >= matrix[i][j + 1]) {
            max = Math.max(max, power + dfs(i, j + 1));
        }

        maxPower[i][j] = max;
        return max;
    }
}