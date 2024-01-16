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

WebUI.navigateToUrl('https://www.kompas.com/')

WebUI.click(findTestObject('Object Repository/Page_Berita Terkini Hari Ini, Kabar Akurat _d061e2/i_Koin_sso__icon__login_top'))

WebUI.click(findTestObject('Object Repository/Page_Berita Terkini Hari Ini, Kabar Akurat _d061e2/span_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login - KG Media ID/input_KG Media ID_email'), 'invalid@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - KG Media ID/input_Password_password'), 'wFoXoz78tFg0bhumoxt+8w==')

WebUI.click(findTestObject('Object Repository/Page_Login - KG Media ID/input_Password_button -primary'))

'Verify if there\'s a message indicating that the entered email or password is invalid'
WebUI.verifyElementVisible(findTestObject('Page_Login - KG Media ID/invalid email text'))

WebUI.closeBrowser()

