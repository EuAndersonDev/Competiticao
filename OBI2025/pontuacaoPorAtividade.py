esportes = 2
artes= 3
ciencias = 5
E = int(input())
A = int(input())
C = int(input())

soma = E * esportes + A * artes + C * ciencias

if soma >= 200:
    print("O")
elif soma >= 150:
    print("S")
elif soma >= 100:
    print("B")
else:
    print("N")