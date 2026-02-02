from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.action_chains import ActionChains
import time


driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/drag-drop")
print("Page Title:", driver.title)

ball = driver.find_element(By.ID, "ball")
dropzone1 = driver.find_element(By.ID, "dropzone1")
dropzone2 = driver.find_element(By.ID, "dropzone2")

actions = ActionChains(driver)

actions.drag_and_drop(ball, dropzone1).perform()
time.sleep(2)

text1 = dropzone1.text
print("After Dropzone 1:", text1)

actions.drag_and_drop(ball, dropzone2).perform()
time.sleep(2)

text2 = dropzone2.text
print("After Dropzone 2:", text2)

driver.quit()


