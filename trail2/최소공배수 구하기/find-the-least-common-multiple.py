import math

def lcm(a, b):
    # 최소공배수 = (a * b) // 최대공약수
    return (a * b) // math.gcd(a, b)

n, m = map(int, input().split())
print(lcm(n, m))
