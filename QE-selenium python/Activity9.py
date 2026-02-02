from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
import time

# Open Firefox browser
driver = webdriver.Firefox()

try:
    # Open the page
    driver.get("https://training-support.net/webelements/keyboard-events")

    # 1. Get page title and print
    print("Page Title:", driver.title)

    # 2. Click on page body and type a string
    body = driver.find_element(By.TAG_NAME, "body")
    body.click()

    actions = ActionChains(driver)
    actions.send_keys("Selenium Test").perform()

    time.sleep(1)  # allow message to update

    # 3. Print message displayed on page
    message = driver.find_element(By.ID, "result")
    print("Message displayed:", message.text)

finally:
    # 4. Close the browser automatically
    driver.quit()










