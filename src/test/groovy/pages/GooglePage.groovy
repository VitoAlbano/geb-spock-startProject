package pages

import geb.Page
/**
 * Created by valbano on 18/04/2016.
 */
class GooglePage extends Page{

    static url = "https://www.google.co.uk/"

    static at = {title == "Google"}

    static content = {
        searchInput { $("#lst-ib") }
        confirmButton(wait:true) { $("[name=btnK]") }
        luckyButton(wait:true) { $("[name=btnI]") }
        searchButton(wait:true) {$('[name=btnG]')}
    }


}
