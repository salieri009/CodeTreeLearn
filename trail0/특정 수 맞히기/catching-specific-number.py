# 정수 25 맞히기 게임
# 입력된 수가 25보다 작으면 Higher
# 입력된 수가 25보다 크면 Lower
# 25가 입력되면 Good 출력 후 종료

while True:
    num = int(input())
    if num < 25:
        print("Higher")
    elif num > 25:
        print("Lower")
    else:
        print("Good")
        break
