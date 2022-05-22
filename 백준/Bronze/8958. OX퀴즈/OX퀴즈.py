import sys
N = int(sys.stdin.readline())
for i in range(N):
    quiz_result = sys.stdin.readline()
    accum = 1
    score = 0
    for q in quiz_result:
        if q == 'O':
            score += accum
            accum += 1
        else:
            accum = 1
    print(score)