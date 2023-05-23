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

Mobile.startApplication('C:\\Users\\afrih\\Downloads\\LoopConsumer.apk', false)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Forgot Password'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 727856217'), '727856217', 0)

Mobile.tap(findTestObject('android.widget.Button - Next'), 0)

Mobile.switchToPortrait()

Mobile.getText(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

Mobile.switchToPortrait()

Mobile.switchToPortrait()

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your password'), 'Philip@2022@', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Confirm your Password'), 'Philip@2022@', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Set'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Next (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your Password (1)'), 'Philip@2022@', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign in'), 0)

Mobile.switchToPortrait()

