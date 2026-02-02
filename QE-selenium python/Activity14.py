from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("https://training-support.net/webelements/tables")

print(driver.title)

rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
cols = driver.find_elements(By.XPATH, "//table/tbody/tr[1]/td")

print("Rows:", len(rows))
print("Columns:", len(cols))

book_before = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[1]")
print("Book in 5th row before sort:", book_before.text)

driver.find_element(By.XPATH, "//table/thead/tr/th[3]").click()
time.sleep(2)

book_after = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[1]")
print("Book in 5th row after sort:", book_after.text)

driver.quit()