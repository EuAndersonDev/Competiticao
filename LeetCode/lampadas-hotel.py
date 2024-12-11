n = int(input())
a = 0
b = 0
temp = 0
qtd = list(map(int, (input().split())))
for i in range(n):
    if qtd[i] == 1 and a == 0:
        a = 1
    elif qtd[i] == 1 and a == 1:
        a = 0
    elif qtd[i] == 2:    
        temp = a
        a = b
        b = temp
        
print(a)
print(b)