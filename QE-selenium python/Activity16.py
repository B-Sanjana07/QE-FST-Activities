from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/selects")
print(driver.title)

select_element = driver.find_element(By.ID, "single-select")
select = Select(select_element)

select.select_by_visible_text("Option 2")
select.select_by_index(2)
select.select_by_value("option4")

options = select.options
for option in options:
    print(option.text)

driver.quit()
