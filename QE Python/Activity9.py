list1 = list(map(int, input("Enter first list numbers: ").split()))
list2 = list(map(int, input("Enter second list numbers: ").split()))

new_list = [x for x in list1 if x % 2 != 0] + [x for x in list2 if x % 2 == 0]

print("New combined list:", new_list)
