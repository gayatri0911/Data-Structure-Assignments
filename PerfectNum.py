num = int(input("Enter number upto which u want to find perfect numbers: "))

for i in range(1, num):
    total = 0
    for j in range(1,i):
        if i%j==0:
            total = total+j
    if total==i:
        print(i)


