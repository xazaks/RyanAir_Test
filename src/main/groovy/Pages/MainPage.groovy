package Pages

import geb.Page

class MainPage extends Page {

    static at = {title.contains('Official Ryanair website')}
    static content = {
        departureAirportCombobox { $('div[name=departureAirportName] input') }
        destinationAirportCombobox { $('div[name=destinationAirportName] input') }
        flyOutDate { $('div.container-from input') }
        flyBackDate { $('div.container-to input') }
        monthName { $('h1.month-name') }
        selectDate { monthName.siblings('ul.days').$('li').not('.unavailable') }
        passanger { $('div.passenger-input input')}
        letsGoButton { $('[translate="common.buttons.lets_go"]') }
    }
}
