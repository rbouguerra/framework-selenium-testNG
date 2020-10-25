package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	/* Locators */
	final static String INPUT_TEXT = "//input[@ng-model='newTodo']";
	final static String ELEMENT1 = "//label[@class='ng-binding']";
	final static String CHECKBOX = "//input[@ng-model='todo.completed']";
	
	
	
	
	/* @FindBy */
	@FindBy(how=How.XPATH, using=INPUT_TEXT)
	public static WebElement inputText;
	@FindBy(how=How.XPATH, using=ELEMENT1)
	public static WebElement element1;
	@FindBy(how=How.XPATH, using=CHECKBOX)
	public static WebElement checkBox;
	
	/* Methods */
	public void submitTodo(String todo) {
		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	} 
	
	public String checkElementContains(WebElement element) {
		
		String elementTodo = element.getText();
		return elementTodo;
	}
	
	public Boolean isCheckBoxSelected(WebElement element) {
		
		Boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected;
	}
}
