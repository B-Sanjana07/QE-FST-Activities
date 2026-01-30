from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()
driver.maximize_window()

driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)

text_field = driver.find_element(By.ID, "input-text")

print("Text field enabled before clicking Enable:",
      text_field.is_enabled())

enable_button = driver.find_element(By.ID, "toggleInput")
enable_button.click()

time.sleep(3)

print("Text field enabled after clicking Enable:",
      text_field.is_enabled())

driver.quit()
