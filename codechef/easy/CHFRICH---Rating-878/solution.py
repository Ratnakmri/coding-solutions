# cook your dish here
T= int(input())

for i in range(0,T):
    A,B,X=map(int,input().split())
    l=(B-A)//X
    print(l)