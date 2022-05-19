from itertools import combinations

for correct in combinations([int(input()) for _ in range(9)], 7): 
  if(sum(correct) == 100):
    result = "\n".join(map(str,correct))
    print(result)