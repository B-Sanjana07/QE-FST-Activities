from selenium import webdriver
import time

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/alerts")

print(driver.title)

driver.execute_script("document.getElementById('prompt').scrollIntoView(true);")
driver.execute_script("document.getElementById('prompt').click();")

time.sleep(1)
alert = driver.switch_to.alert
print(alert.text)
alert.send_keys("Awesome!")
alert.accept()

driver.quit()
