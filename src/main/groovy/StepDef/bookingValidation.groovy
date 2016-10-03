package StepDef

import static cucumber.api.groovy.EN.*
import geb.Browser

import Pages.MainPage

browser = new Browser()
mainPage = new MainPage()

Given(~/^User is on RyanAir page$/){ ->

    browser.to MainPage
    page = mainPage
}

And(~/^He fills flight details$/){ ->

    browser.at mainPage
    mainPage.departureAirportCombobox.value('Dublin')
}