M, N = map(int, input().split())
estoque = [list(map(int, input().split())) for _ in range(M)]
P = int(input())
vendas = 0
linha = 0
coluna = 0
for _ in range(P):
    i, j = map(int, input().split())
    i -= 1
    j -= 1
    if estoque[i][j] > 0:
        estoque[i][j] -= 1
        vendas += 1
print(vendas)


