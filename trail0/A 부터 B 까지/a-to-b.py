# 정수 A부터 B까지 숫자를 출력하는 프로그램
# 규칙:
# - 홀수 → 2배
# - 짝수 → +3
# B보다 커지면 종료

A, B = map(int, input().split())

while A <= B:
    print(A, end=" ")
    if A % 2 == 1:   # 홀수일 때
        A *= 2
    else:            # 짝수일 때
        A += 3
