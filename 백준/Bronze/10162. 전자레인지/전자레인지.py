put = int(input())

if put % 10 != 0:
    print(-1)
else:
    A = B = C = 0
    A = put // 300
    B = (put % 300) // 60
    C = (put % 300) % 60 // 10
    print(A, B, C)