# 변수 선언 및 입력
n = int(input())

# n회 반복합니다.
for i in range(n):
    # 변수 선언, 입력
    inp = input()
    arr = inp.split()
    a, b = int(arr[0]), int(arr[1])

    ans = 0
    
    # a부터 b까지 짝수를 전부 더한 값을 출력합니다.
    for j in range(a, b + 1):
        if j % 2 == 0:
            ans += j
    
    print(ans)
