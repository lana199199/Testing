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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/')

WebUI.delay(10)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Sign In'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Sign in  Katalon Solution/a_Forgot your password'), 10)

WebUI.click(findTestObject('Object Repository/Page_Sign in  Katalon Solution/a_Forgot your password'))

WebUI.switchToWindowTitle('Katalon TestOps')

WebUI.setText(findTestObject('Object Repository/Page_Katalon TestOps/input_Email_email'), 'thanh.pnguyen@katalon.com')

WebUI.delay(25)

WebUI.click(findTestObject('Object Repository/Page_Katalon TestOps/div_id(katalon-rec_elementInfoDiv) (2)'))

WebUI.click(findTestObject('Object Repository/Page_Katalon TestOps/div_stairs_button-holder help-button-holder'))

WebUI.click(findTestObject('Object Repository/Page_Katalon TestOps/button_Reset Password'))

