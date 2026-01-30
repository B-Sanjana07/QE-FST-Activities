from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()
driver.maximize_window()

driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)
checkbox = driver.find_element(By.ID, "checkbox")

print("Checkbox selected before clicking:",
      checkbox.is_selected())

checkbox.click()
time.sleep(2)

print("Checkbox selected after clicking:",
      checkbox.is_selected())

driver.quit()
