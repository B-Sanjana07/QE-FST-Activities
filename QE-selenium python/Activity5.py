from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service
import time

driver = webdriver.Firefox()
driver.maximize_window()

driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)

checkbox = driver.find_element(By.ID, "checkbox")

print("Checkbox visible before clicking Remove:",
      checkbox.is_displayed())

remove_button = driver.find_element(By.ID, "toggleCheckbox")
remove_button.click()

time.sleep(3)

try:
    print("Checkbox visible after clicking Remove:",
          checkbox.is_displayed())
except:
    print("Checkbox is not visible after clicking Remove")

driver.quit()
