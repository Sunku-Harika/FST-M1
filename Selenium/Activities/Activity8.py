from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    print("Page title: ", driver.title)

    actions=ActionChains(driver)

    cargoLock = driver.find_element(By.XPATH, "(//h1[@class='svelte-hs12g9'])[1]")
    cargoToml = driver.find_element(By.XPATH, "(//h1[@class='svelte-hs12g9'])[2]")
    srcButton = driver.find_element(By.XPATH, "(//h1[@class='svelte-hs12g9'])[3]")
    targetButton = driver.find_element(By.XPATH, "(//h1[@class='svelte-hs12g9'])[4]")

    actions.click(cargoLock).pause(1).move_to_element(cargoToml).pause(5).click(cargoToml).perform()
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)

    actions.double_click(srcButton).pause(3).context_click(targetButton).pause(3).perform()

    actions.click(driver.find_element(By.XPATH, ("//span[text()='Open']"))).pause(5).perform()

    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)