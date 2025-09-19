from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/target-practice")
    print("Page title: ",driver.title)

  
    third_heading = driver.find_element(By.XPATH,"//h3[text()='Heading #3']")
    print(third_heading.text)
    



