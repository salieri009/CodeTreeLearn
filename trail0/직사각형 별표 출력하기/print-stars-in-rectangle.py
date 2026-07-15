# N과 M 입력받기
a, b = map(int, input().split())

# 직사각형 출력
for i in range(a):        # a는 행의 개수
    for j in range(b):    # b는 열의 개수
        print("* ", end="")  # 줄바꿈 없이 별 출력
    print()  # 한 행이 끝나면 줄바꿈
