max = 0
cnt = 0
for i in range(9):
  cnt += 1
  a = int(input()) 
  if max < a:
    max =a 
    l = cnt
print(max ,l)