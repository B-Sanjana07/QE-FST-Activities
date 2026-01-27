import pandas as pd

df = pd.read_excel("contacts.xlsx")
rows, cols = df.shape
print("Number of rows:", rows)
print("Number of columns:", cols)

print("\nEmail column:")
print(df["Email"])

sorted_df = df.sort_values("FirstName")
print("\nData sorted by FirstName:")
print(sorted_df)
