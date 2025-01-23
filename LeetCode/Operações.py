operacao = input()

if operacao == "M":
    n1, n2 = map(int, input().split())
    print(n1 * n2)
elif operacao == "D":
    n1, n2 = map(int, input().split())
    print(f"{n1 / n2:.2f}") 