import geb.spock.GebReportingSpec

import pages.GooglePage
import pages.GoogleResultPage



/**
 * Created by valbano on 18/04/2016.
 */
class SearchOnGoogle extends GebReportingSpec {

    static simpleSearch = "pitaya"

    def setup(){
        to GooglePage
    }

    def "search a word on google mainpage"() {
        given:
        at GooglePage

        when: "Search a random word on page"
        searchInput = "Dragon Fruit"
        searchButton.click()

        then:
        to GoogleResultPage
        and:
        linkElement.isDisplayed()

    }

}