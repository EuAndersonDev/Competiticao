N = int(input())
valores = list(map(int, input().split()))

count = 0

for i in range(N-2):
    if valores[i]== 1 and valores[i+1] == 0 and valores[i+2] == 0:
        count += 1;

print(count)

