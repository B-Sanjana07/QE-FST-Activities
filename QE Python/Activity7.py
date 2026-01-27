total = 0
n = int(input("How many numbers do you want to enter? "))

for i in range(n):
    num = int(input("Enter number: "))
    total += num
print("The sum of all numbers is:", total)
