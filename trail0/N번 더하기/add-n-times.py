# 입력: A와 N
A, N = map(int, input().split())

# N번 반복
for i in range(N):
    A += N
    print(A)
