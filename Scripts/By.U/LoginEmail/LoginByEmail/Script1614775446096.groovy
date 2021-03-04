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

WebUI.openBrowser('https://www.byu.id/id')

WebUI.maximizeWindow()

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Gmail\\1.png')

WebUI.click(findTestObject('Patch-Login/Logo-Login'))

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Gmail\\2.png')

WebUI.click(findTestObject('Patch-Login/Email'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Gmail\\3.png')

WebUI.setText(findTestObject('Patch-Login/UserEmail'), 'nanangqomarudin7@gmail.com')

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Gmail\\4.png')

WebUI.click(findTestObject('Patch-Login/Berikutnya'))

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Gmail\\5.png')

WebUI.delay(1)

WebUI.closeBrowser()

