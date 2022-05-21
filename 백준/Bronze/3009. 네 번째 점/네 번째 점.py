x,y=[],[]
a,b=0,0
for i in range(3):
  a,b = map(int, input().split())
  x.append(a)
  y.append(b)
for _ in range(3):
  if x.count(x[_]) == 1:
    a = x[_] 
  if y.count(y[_]) == 1:
    b = y[_] 
print(a,b)