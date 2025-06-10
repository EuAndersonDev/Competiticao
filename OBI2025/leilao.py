from tokenize import String

N = int(input())
MaiorV = 0
MaiorP = ""

for i in range(N):
    P = input()
    V = int(input())

    if MaiorV < V:
        MaiorV = V
        MaiorP = P
    else:
        continue

print(MaiorP)
print(MaiorV)
