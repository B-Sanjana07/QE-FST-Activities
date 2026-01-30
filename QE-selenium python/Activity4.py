from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/target-practice")

print("Page Title:", driver.title)

third_header = driver.find_element(By.XPATH, "(//h3)[3]")
print("3rd Header Text:", third_header.text)

fifth_header = driver.find_element(By.XPATH, "(//h3)[5]")
color = fifth_header.value_of_css_property("color")
print("5th Header Color:", color)

purple_button = driver.find_element(By.CSS_SELECTOR, "button.bg-purple-500")
print("Purple Button Classes:", purple_button.get_attribute("class"))

slate_button = driver.find_element(By.CSS_SELECTOR, "button.bg-slate-500")
print("Slate Button Text:", slate_button.text)

driver.quit()



