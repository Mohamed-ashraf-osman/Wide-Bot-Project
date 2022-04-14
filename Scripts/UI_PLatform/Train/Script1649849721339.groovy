import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://platform-qc.widebot.net/auth/login')

WebUI.executeJavaScript('localStorage.setItem(\'9F808C5307CF273ED62EB67BD033382F\',\'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzQ1Yjc1NC05ZDE5LTQwZTAtYmY4ZS1hM2QwYzljYmM4NTYiLCJleHAiOjE2NDk5MzQzNTMsImlzcyI6Imh0dHBzOi8vcGxhdGZvcm0tcWMud2lkZWJvdC5uZXQvIiwiYXVkIjoiaHR0cHM6Ly9hdXRoLXFjLndpZGVib3QubmV0LyJ9.rvtA08EatYnEGeJqF7A4p2BClEyxwRX-bk8KY-I_PLg\')'
	, null)
WebUI.executeJavaScript('localStorage.setItem(\'8AD37A39EE68FA4994602CD4D3D01FE4\',\'testing_aqwxowf_qc@tfbnw.net\')'
	, null)
WebUI.executeJavaScript('localStorage.setItem(\'currentState\',\'AM0nhI84yxvvfHmJmiuoWrI5LI9IKHRu8ljqVI+wvJm8OOygrCqvQgMB3auHyMkOeRF8rcT/xjRgbmssWvJ9kCHF7xMAm+y0G0X4R3VRRt0nnYdjEzMQqtKKClfEAbUgQSwk6uxZ97hljHrP2y8C5YdohvIrDA+F\')'
	, null)

WebUI.navigateToUrl('https://platform-qc.widebot.net/bot/list')
