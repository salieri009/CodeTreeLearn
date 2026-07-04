a, b = map(int, input().split())

# 첫 번째 값: A가 B보다 작으면 1, 아니면 0
first = 1 if a < b else 0

# 두 번째 값: A와 B가 같으면 1, 아니면 0
second = 1 if a == b else 0

print(first, second)
