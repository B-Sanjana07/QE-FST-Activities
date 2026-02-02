from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://training-support.net/webelements/tables")

print(driver.title)

rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
cols = driver.find_elements(By.XPATH, "//table/tbody/tr[1]/td")

print("Rows:", len(rows))
print("Columns:", len(cols))

third_row_cells = driver.find_elements(By.XPATH, "//table/tbody/tr[3]/td")
for cell in third_row_cells:
    print(cell.text)

cell_value = driver.find_element(By.XPATH, "//table/tbody/tr[2]/td[2]")
print("Second row second column:", cell_value.text)

driver.quit()