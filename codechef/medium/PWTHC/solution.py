# Read input values
N, K, P = map(int, input().split())

# Calculate total chairs
total_chairs = N * K

# Compare with number of students
if total_chairs >= P:
    print("YES")
else:
    print("NO")
