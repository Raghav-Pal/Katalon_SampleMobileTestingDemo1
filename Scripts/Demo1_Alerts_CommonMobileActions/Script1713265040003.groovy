import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile


RunConfiguration.setMobileDriverPreferencesProperty("orientation", 'PORTRAIT')

Mobile.startApplication('/Users/raghavpal/Katalon Studio/SampleMobileTestingDemo1/androidapp/APIDemos.apk', true)

Mobile.verifyElementVisible(findTestObject('Object Repository/Demo1_Alerts/android.widget.TextView - App'), 
    10)

Mobile.tap(findTestObject('Object Repository/Demo1_Alerts/android.widget.TextView - App'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.TextView - Alert Dialogs'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.TextView - Alert Dialogs'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - OK'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - CANCEL'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - CANCEL'), 10)

not_run: Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

not_run: Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - LIST DIALOG'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - LIST DIALOG'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.TextView - Command two'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.TextView - Command two'), 10)

Mobile.pressBack()

not_run: Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

not_run: Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

not_run: Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK CANCEL DIALOG WITH A MESSAGE'), 
    10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - SINGLE CHOICE LIST'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - SINGLE CHOICE LIST'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.CheckedTextView - Satellite'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.CheckedTextView - Satellite'), 10)

Mobile.verifyElementVisible(findTestObject('Demo1_Alerts/android.widget.Button - OK'), 10)

Mobile.tap(findTestObject('Demo1_Alerts/android.widget.Button - OK'), 10)

Mobile.pressBack()

Mobile.pressBack()

not_run: Mobile.closeApplication()

