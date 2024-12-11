n = int(input())
arr = []
soma = 0
count = 0
for i in range(n):
    arr.append(int(input()))
    soma += arr[i]
    count+=1
    
    if soma >= 1000000:
        break
print(count)    
