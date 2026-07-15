# 배열을 구현하여 주어진 수를 입력받습니다.
arr = list(input().split())

# 9부터 0까지의 인덱스에 주어진 문자를 차례대로 출력합니다.
for i in range(9, -1, -1):
    print(arr[i], end="")
