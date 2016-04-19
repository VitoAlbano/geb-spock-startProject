package pages

import geb.Page

/**
 * Created by valbano on 18/04/2016.
 */
class GoogleResultPage extends Page {

    static url = "https://www.google.co.uk/?gws_rd=ssl#q=Dragon+fruit"

    static at = {title == "Google"}

    static content = {
        searchBody(wait:true) {$('body')}
        linkElement (wait:true) {$('cite')}
    }




}
