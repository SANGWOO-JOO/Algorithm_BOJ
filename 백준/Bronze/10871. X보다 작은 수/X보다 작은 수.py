a,x = map(int, input().split())
c = list(map(int, input().split()))
for i in range(a):
  if c[i] < x:
    print(c[i], end=" ")