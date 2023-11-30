package genericLibrary;

import org.openqa.selenium.WebElement;

public class JavaScriptUtil extends UtilityMethods {
	
	public void jsClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

	
	public void jsSendkeys(String data,WebElement element) {
		js.executeScript("arguments[0].value='"+data+"';", element);
	}
	
	
	public  void jsScrollBy(int X,int Y) {
		js.executeScript("window.scrollBy("+X+","+Y+");");
	}

	
	public void jsScrollTo(int X,int Y) {
		js.executeScript("window.scrollTo("+X+","+Y+")");
	}

	
	public void jsScrollIntoView(boolean bool,WebElement element) {
		js.executeScript("arguments[0].scrollIntoView("+bool+")",element);
	}

	
	public void jsScrollToBottomOfThePage() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void jsClear(WebElement element) {
		js.executeScript("arguments[0].value='';",element);
	}

}
