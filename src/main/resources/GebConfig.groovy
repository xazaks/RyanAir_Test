import org.openqa.selenium.firefox.FirefoxDriver

driver = {
    driverInstance = new FirefoxDriver()

    driverInstance.manage().window().maximize()
    driverInstance
}

baseUrl = "https://www.google.pl/"
baseNavigatorWaiting = true