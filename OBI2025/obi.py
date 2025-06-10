N, P = map(int, input().split())

valores1 = []
valores2 = []
contador = 0
for i in range(N):
    valores1, valores2 = map(int, input().split())
    valoresFinal = valores1 + valores2
    if valoresFinal >= P:
        contador += 1


print(contador)