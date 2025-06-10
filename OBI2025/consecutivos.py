N = int(input())
valores = list(map(int, input().split()))

maior_seq = 1
atual_seq = 1

for i in range(1, N):
    if valores[i] == valores[i-1]:
        atual_seq += 1
        if atual_seq > maior_seq:
            maior_seq = atual_seq
    else:
        atual_seq = 1

print(maior_seq)