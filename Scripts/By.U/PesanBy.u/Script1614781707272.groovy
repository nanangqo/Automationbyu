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

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\1.png')

WebUI.click(findTestObject('Patch-Login/Logo-Login'))

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\2.png')

WebUI.click(findTestObject('Patch-Login/Mobile'))

WebUI.setText(findTestObject('Patch-Login/InputNomorHP'), '087878224040')

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\3.png')

WebUI.click(findTestObject('Patch-Login/Lanjutkan'))

WebUI.delay(1)

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\4.png')

WebUI.setText(findTestObject('Patch-Login/PIN'), '870569', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(40)

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\5.png')

WebUI.delay(3)

WebUI.click(findTestObject('Patch-Login/Lanjutkan'))

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\6.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/PaketData10GB'))

WebUI.delay(2)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\7.png')

WebUI.click(findTestObject('DSHome/Pulsa10rb'))

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\8.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/ToppingY'))

WebUI.delay(1)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\9.png')

WebUI.delay(1)

WebUI.click(findTestObject('DSHome/Lanjut'))

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\10.png')

WebUI.click(findTestObject('DSHome/PilihNomer'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\11.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/IconNext'))

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\12.png')

WebUI.click(findTestObject('DSHome/PilihAntar'))

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\13.png')

WebUI.delay(5)

WebUI.setText(findTestObject('DSHome/NamaPenerima'), 'Nanang')

WebUI.setText(findTestObject('DSHome/NomerPenerima'), '081212660643')

WebUI.setText(findTestObject('DSHome/AlamatPenerima'), 'Kp.Bakung RT 001 RW 005 no.34 dekat lapangan bulutangkis')

WebUI.setText(findTestObject('DSHome/Kecamatan'), '16414')

WebUI.click(findTestObject('DSHome/16414'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\14.png')

WebUI.delay(3)

WebUI.click(findTestObject('DSHome/PilihPengiriman'))

WebUI.click(findTestObject('DSHome/JNE'))

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\15.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/LanjutkePembayaran'))

WebUI.delay(10)

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\16.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/VirtualAccount'))

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\17.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/BCA'))

WebUI.takeFullPageScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\18.png')

WebUI.delay(2)

WebUI.click(findTestObject('DSHome/LanjutkanPembayaran'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('D:\\Screenshot\\Order satu\\19.png')

WebUI.delay(2)

WebUI.closeBrowser()

