package com.hmtmcse.ocb

import org.grails.web.util.WebUtils

class AppUtil {

    static saveResponse(Boolean isSucess, def model) {
        return [isSucess: isSucess, model: model]
    }

    static getAppSession() {
        return WebUtils.retrieveGrailsWebRequest().session
    }

    static infoMessage (String message, boolean status = true) {
        return [info: message, success: status]
    }

}
