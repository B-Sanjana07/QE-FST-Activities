from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/dynamic-content")
print(driver.title)
driver.find_element(By.XPATH, "//button[text()='Click me!']").click()
wait = WebDriverWait(driver, 10)
text = wait.until(EC.visibility_of_element_located((By.ID, "dynamicText")))
print(text.text)
driver.quit()
