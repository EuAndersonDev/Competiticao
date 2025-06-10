v = int(input())
a = int(input())
f = int(input())
p = int(input())

contas = [a, f, p]
contas.sort()
pagas = 0
for contas in contas:
    if v >= contas:
        v -= contas
        pagas += 1
    else:
        break

print(pagas)