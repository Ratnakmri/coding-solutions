T = int(input())
for _ in range(T):
    N, K, P = map(int, input().split())
    if N * K >= P:
        print("YES")
    else:
        print("NO")
