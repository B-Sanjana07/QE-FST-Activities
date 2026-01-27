fruits = {
    "apple": 120,
    "banana": 40,
    "orange": 60,
    "mango": 150,
    "grapes": 80
}

fruit_name = input("Enter the fruit name: ").lower()

if fruit_name in fruits:
    print(fruit_name, "is available and the price is", fruits[fruit_name])
else:
    print(fruit_name, "is not available in the shop")
