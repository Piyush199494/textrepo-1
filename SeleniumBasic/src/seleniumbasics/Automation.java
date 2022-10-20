package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://demo.actitime.com/login.do");
		String actualurl=c1.getCurrentUrl();
		String actualTitle=c1.getTitle();
		System.out.println("Actual Url is "+actualurl);
        System.out.println("Actual title is "+actualTitle);
        
        
        String ExpectedUrl="https://demo.actitime.com/login.do";
        String ExpectedTitle="actiTIME - Login";
        System.out.println("URL validation "+actualurl.equals(ExpectedUrl));
        System.out.println("Title Validation "+actualTitle.equals(ExpectedTitle));
        
        String pageSource=c1.getPageSource();
      //  System.out.println("Page source length"+pageSource.length());
      //  System.out.println("page source content "+pageSource);
        
	}

}
