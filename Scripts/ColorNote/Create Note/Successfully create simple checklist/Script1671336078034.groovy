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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.TextView - Add Item'), 0)

Mobile.sendKeys(findTestObject('Object Repository/ColorNote/android.widget.EditText (2)'), 'Satu')

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.TextView - Add Item'), 0)

Mobile.sendKeys(findTestObject('ColorNote/android.widget.EditText (3)'), 'Dua')

Mobile.tap(findTestObject('Object Repository/ColorNote/android.widget.Button - OK (1)'), 0)

Mobile.pressBack()

x = Mobile.getText(findTestObject('Object Repository/ColorNote/android.widget.TextView - Satu'), 0)

y = Mobile.getText(findTestObject('Object Repository/ColorNote/android.widget.TextView - Dua'), 0)

Mobile.verifyMatch(x, 'Satu', false)

Mobile.verifyMatch(y, 'Dua', false)

Mobile.closeApplication()
