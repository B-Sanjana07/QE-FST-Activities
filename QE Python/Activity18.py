import pandas as pd

df = pd.read_csv("users.csv")

print("Usernames column:")
print(df["Usernames"])

print("\nSecond row username and password:")
print(df.loc[1, ["Usernames", "Passwords"]])

print("\nData sorted by Usernames (Ascending):")
print(df.sort_values("Usernames"))

print("\nData sorted by Passwords (Descending):")
print(df.sort_values("Passwords", ascending=False))
