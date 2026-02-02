from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/alerts")

print(driver.title)

driver.find_element(By.ID, "simple").click()

alert = driver.switch_to.alert
print(alert.text)
alert.accept()

driver.quit()
