import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import internal.GlobalVariable as GlobalVariable

'Start the application using the app file'
Mobile.startApplication('kobiton-store:184', false)

'Tap to navigate to the \"Create Account\" screen'
Mobile.tap(findTestObject('Material Login App/android.widget.TextView0 - No account yet Create one'), 0)

'Set text to the Name text field'
Mobile.setText(findTestObject('Material Login App/android.widget.EditText0'), 'name', 0)

'Validate that the text input is set to Name text field'
Mobile.verifyElementAttributeValue(findTestObject('Material Login App/android.widget.EditText0'), 'text', 'name', 5)

'Set text to the Address text field'
Mobile.setText(findTestObject('Material Login App/android.widget.EditText1'), 'address', 0)

'Validate that the text input is set to Address text field'
Mobile.verifyElementAttributeValue(findTestObject('Material Login App/android.widget.EditText1'), 'text', 'address', 5)

'Hide the keyboard to show other text fields'
Mobile.hideKeyboard()

'Set text to the Email text field'
Mobile.setText(findTestObject('Material Login App/android.widget.EditText2'), 'email@domain.com', 0)

'Validate that the text input is set to Email text field'
Mobile.verifyElementAttributeValue(findTestObject('Material Login App/android.widget.EditText2'), 'text', 'email@domain.com', 
    5)

'Hide the keyboard to show other text fields'
Mobile.hideKeyboard()

'Set text to the Mobile Phone text field'
Mobile.setText(findTestObject('Material Login App/android.widget.EditText3'), '099949197', 0)

'Validate that the text input is set to Mobile Phone text field'
Mobile.verifyElementAttributeValue(findTestObject('Material Login App/android.widget.EditText3'), 'text', '099949197', 5)

'Hide the keyboard to show other text fields'
Mobile.hideKeyboard()

'Set text to the Password text field'
Mobile.setText(findTestObject('Material Login App/android.widget.EditText4'), 'password', 0)

'Validate that the text input is set to Password text field'
Mobile.verifyElementAttributeValue(findTestObject('Material Login App/android.widget.EditText4'), 'text', 'password', 5)

'Hide the keyboard to show other text fields'
Mobile.hideKeyboard()

'Set text to the Re-enter Password text field'
Mobile.setText(findTestObject('Material Login App/android.widget.EditText5'), 'password', 0)

'Validate that the text input is set to Re-enter Password text field'
Mobile.verifyElementAttributeValue(findTestObject('Material Login App/android.widget.EditText5'), 'text', 'password', 5)

'Hide the keyboard to show the Create Account button'
Mobile.hideKeyboard()

'Tap on the \"Create Account\" button to finish registration'
Mobile.tap(findTestObject('Material Login App/android.widget.Button0 - CREATE ACCOUNT'), 0)

'Stop and close the application'
Mobile.closeApplication()

