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

Mobile.startApplication('/Users/raghavpal/Desktop/MobileApps/APK/APIDemos.apk', true)

Mobile.verifyElementVisible(findTestObject('Object Repository/Demo3_ScrollActions/android.widget.TextView - Views'), 10)

Mobile.tap(findTestObject('Object Repository/Demo3_ScrollActions/android.widget.TextView - Views'), 10)

//'Swipe from 200,300 to 400,600 posisition on screen'
not_run: Mobile.swipe(200, 300, 400, 600)

//'Since 5.1.0.2, endX and endY will be relative position of (startX, startY) position
not_run: Mobile.swipe(200, 300, 200, 300)

Mobile.scrollToText('ScrollBars')

Mobile.verifyElementVisible(findTestObject('Object Repository/Demo3_ScrollActions/android.widget.TextView - ScrollBars'), 
    10)

Mobile.tap(findTestObject('Object Repository/Demo3_ScrollActions/android.widget.TextView - ScrollBars'), 10)

Mobile.verifyElementVisible(findTestObject('Object Repository/Demo3_ScrollActions/android.widget.TextView - 1. Basic'), 
    10)

Mobile.tap(findTestObject('Object Repository/Demo3_ScrollActions/android.widget.TextView - 1. Basic'), 10)

Mobile.swipe(200, 300, 400, 600)

//'Since 5.1.0.2, endX and endY will be relative position of (startX, startY) position
Mobile.swipe(200, 300, 200, 300)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

