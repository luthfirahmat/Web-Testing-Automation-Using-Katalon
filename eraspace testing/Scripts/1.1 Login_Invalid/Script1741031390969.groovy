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

WebUI.navigateToUrl('https://eraspace.com/')

WebUI.click(findTestObject('Object Repository/1.1 Login_Invalid/Page_Eraspace  Pengalaman Belanja Online Te_7fe8bd/div_'))

WebUI.click(findTestObject('Object Repository/1.1 Login_Invalid/Page_Eraspace  Pengalaman Belanja Online Te_7fe8bd/span_Masuk'))

WebUI.setText(findTestObject('Object Repository/1.1 Login_Invalid/Page_eraspace.com - Rasakan pengalaman bela_fd954d/input_No Handphone atau Email_identifier'), 
    'luthfirahmat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1.1 Login_Invalid/Page_eraspace.com - Rasakan pengalaman bela_fd954d/input_Password_password'), 
    '9Zrc+3MEjTE=')

WebUI.click(findTestObject('Object Repository/1.1 Login_Invalid/Page_eraspace.com - Rasakan pengalaman bela_fd954d/span_Masuk'))

