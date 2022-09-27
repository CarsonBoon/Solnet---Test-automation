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

WebUI.navigateToUrl('http://localhost:4200/')

WebUI.setText(findTestObject('Page_Task Manager/input_Login to manage your tasks_email'), 'User')

WebUI.setEncryptedText(findTestObject('Page_Task Manager/input_Email_password'), 'n40H7qxhE1I=')

WebUI.click(findTestObject('Page_Task Manager/button_Login'))

WebUI.click(findTestObject('Page_Task Manager/div_Login to manage your tasks EmailPasswor_198fb6'))

WebUI.setEncryptedText(findTestObject('Page_Task Manager/input_Email_password'), '1/VWEm4uipk=')

WebUI.click(findTestObject('Page_Task Manager/span_Login'))

WebUI.click(findTestObject('Page_Task Manager/div_Login to manage your tasks EmailPasswor_198fb6'))

WebUI.setText(findTestObject('Page_Task Manager/input_Login to manage your tasks_email'), 'user')

WebUI.click(findTestObject('Page_Task Manager/button_Login'))

WebUI.setText(findTestObject('Page_Task Manager/input_My day_taskTitle'), 'task 2')

WebUI.click(findTestObject('Page_Task Manager/div_Task description'))

WebUI.setText(findTestObject('Page_Task Manager/input_Task title_taskDesc'), 'task 2')

WebUI.click(findTestObject('Page_Task Manager/span_Add'))

WebUI.setText(findTestObject('Page_Task Manager/input_My day_taskTitle'), 'task 3')

WebUI.setText(findTestObject('Page_Task Manager/input_Task title_taskDesc'), 'task 3')

WebUI.click(findTestObject('Page_Task Manager/div_Task due date_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Page_Task Manager/button_Add'))

WebUI.click(findTestObject('Page_Task Manager/div_All Tasks'))

WebUI.verifyElementPresent(findTestObject('Page_Task Manager/mat-card_Test Task 1star_border'), 0)

WebUI.click(findTestObject('Page_Task Manager/mat-card_task 2star_border'))

WebUI.verifyElementPresent(findTestObject('Page_Task Manager/mat-card_task 2star_border'), 0)

WebUI.click(findTestObject('Page_Task Manager/mat-card_task 3star'))

WebUI.verifyElementPresent(findTestObject('Page_Task Manager/mat-card_task 3star'), 0)

WebUI.click(findTestObject('Page_Task Manager/div_My day'))

WebUI.click(findTestObject('Page_Task Manager/mat-icon_close'))

WebUI.click(findTestObject('Page_Task Manager/mat-icon_close'))

WebUI.click(findTestObject('Page_Task Manager/mat-icon_logout'))

WebUI.closeBrowser()

