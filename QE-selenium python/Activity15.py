from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-attributes")
print(driver.title)

username = wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, "input[id^='username']")))
password = driver.find_element(By.CSS_SELECTOR, "input[id^='password']")
submit = driver.find_element(By.CSS_SELECTOR, "button[id^='submit']")

username.send_keys("admin")
password.send_keys("password")
submit.click()

message = wait.until(EC.visibility_of_element_located((By.ID, "success")))
print(message.text)

driver.quit()
