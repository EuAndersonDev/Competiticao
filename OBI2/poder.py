import sys
sys.setrecursionlimit(200000)

def dfs(i, j, matrix, max_power, visited, N, M):
    if visited[i][j]:
        return max_power[i][j]

    visited[i][j] = True
    power = matrix[i][j]
    max_p = power

    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]  # Up, Down, Left, Right
    for di, dj in directions:
        ni, nj = i + di, j + dj
        if 0 <= ni < N and 0 <= nj < M and power >= matrix[ni][nj]:
            max_p = max(max_p, power + dfs(ni, nj, matrix, max_power, visited, N, M))

    max_power[i][j] = max_p
    return max_p

def main():
    N, M = map(int, input().split())
    matrix = [list(map(int, input().split())) for _ in range(N)]
    
    max_power = [[0] * M for _ in range(N)]
    visited = [[False] * M for _ in range(N)]
    
    for i in range(N):
        for j in range(M):
            if not visited[i][j]:
                dfs(i, j, matrix, max_power, visited, N, M)
    
    for row in max_power:
        print(" ".join(map(str, row)))

if __name__ == "__main__":
    main()