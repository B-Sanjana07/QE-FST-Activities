from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/login-form/")
print("Page Title:", driver.title)

driver.find_element(By.XPATH, "//input[@id='username']").send_keys("admin")
driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")
driver.find_element(By.XPATH, "//button[@type='submit']").click()

time.sleep(2)
driver.quit()
