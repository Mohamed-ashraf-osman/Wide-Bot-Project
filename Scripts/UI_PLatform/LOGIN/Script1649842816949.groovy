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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://platform-qc.widebot.net/auth/login')

WebUI.click(findTestObject('LOGIN_FB/Page_WideBot Platform/button_Sign In with Facebook'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('LOGIN_FB/Page_Log in to Facebook  Facebook/input_Log in to Facebook_email'), 'testing_aqwxowf_qc@tfbnw.net')

WebUI.setText(findTestObject('LOGIN_FB/Page_Log in to Facebook  Facebook/input_Log in to Facebook_pass'), 'Esraa@123456')

WebUI.click(findTestObject('LOGIN_FB/Page_Log in to Facebook  Facebook/button_Log In'))

WebUI.click(findTestObject('LOGIN_FB/Page_Log in With Facebook/div_Continue as Testing QC'))

