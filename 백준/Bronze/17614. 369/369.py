a = 0
for i in range(1, int(input())+1):
    for j in str(i):
        if j in ('3','6','9'):
            a+=1
print(a)