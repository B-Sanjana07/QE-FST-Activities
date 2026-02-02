from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/dynamic-controls")
print(driver.title)

checkbox = driver.find_element(By.XPATH, "//input[@type='checkbox']")
toggle_button = driver.find_element(By.ID, "toggleCheckbox")

toggle_button.click()
wait = WebDriverWait(driver, 10)
wait.until(EC.invisibility_of_element(checkbox))

toggle_button.click()
checkbox = wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@type='checkbox']")))
checkbox.click()

driver.quit()
