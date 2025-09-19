from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Page title: ", driver.title)

    textbox = driver.find_element(By.ID, "textInput")
    
    print("text field is enabled:: ", textbox.is_enabled())

    driver.find_element(By.ID,"textInputButton").click()
    
    print("text field is enabled:: ", textbox.is_enabled())

    from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Page title: ", driver.title)

    textbox = driver.find_element(By.ID, "textInput")
    
    print("text field is enabled:: ", textbox.is_enabled())

    driver.find_element(By.ID,"textInputButton").click()
    
    print("text field is enabled:: ", textbox.is_enabled())

    
 






    
