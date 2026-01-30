from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains


driver = webdriver.Firefox()
actions = ActionChains(driver)

driver.get("https://training-support.net/webelements/mouse-events")

print("Page Title:", driver.title)

cargo_lock = driver.find_element(By.ID, "cargo-lock")
cargo_toml = driver.find_element(By.ID, "cargo-toml")
src = driver.find_element(By.ID, "src")
target = driver.find_element(By.ID, "target")
confirmation = driver.find_element(By.ID, "result")

actions.click(cargo_lock)\
       .move_to_element(cargo_toml)\
       .click()\
       .perform()

print("Confirmation Text (Seq 1):", confirmation.text)

actions.double_click(src)\
       .context_click(target)\
       .perform()

driver.find_element(By.CSS_SELECTOR, "li[data-action='open']").click()

print("Confirmation Text (Seq 2):", confirmation.text)

driver.quit()
