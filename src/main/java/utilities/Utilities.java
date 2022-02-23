package utilities;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;

	import core.Base;

	public class Utilities extends Base{
		
		public static void compareText(String actualText, String expectedText) {

			if (actualText.equalsIgnoreCase(expectedText)) {
				System.out.println(actualText + " = " + expectedText + "Passed");
			} else {
				System.out.println(actualText + " != " + expectedText + "Failed");
			}
		}

		
		public static void takeScreenShot(String fileName) throws IOException {
			
			String path = ".\\output\\screenShots\\";
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path + fileName + ".png"));
		}

		public static void clickWithJSE(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}

		public static void highlightelementRedBorder(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='2px solid red'", element);
		}

		// How we can highlight an element background
		public static void highlightelementBackground(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.background='yellow'", element);
		}

		// What if we want to do both/above with same method?
		// give border and highlith
		public static void highlightelementBorderAndBackground(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		}

		// How we can scroll down the page with JSExecutor
		public static void scrolldownPage() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		// how to sendkeys with JSExecutor
		public static void sendKeys(WebElement element, String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='" + value + "'", element);
		}
}

