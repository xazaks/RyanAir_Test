package StepDef

import geb.Browser
import geb.binding.BindingUpdater
import org.openqa.selenium.OutputType

import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.Hooks.Before

Before() {

    def browser = new Browser()
    def bindingUpdater = new BindingUpdater(binding, browser)
    bindingUpdater.initialize()
}

After() { scenario ->

    if (scenario.failed) {

        scenario.embed(browser.driver.getScreenshotAs(OutputType.BYTES), "image/png")
    }
    bindingUpdater.remove()
}