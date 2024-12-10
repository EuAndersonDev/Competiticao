
n = list(input().split())
a = len(n)


m = 0
i = 0
count = 0

while m < 1000000:
    int(n[i])
    m += n[i]
    i += 1
    count += 1

print(count)