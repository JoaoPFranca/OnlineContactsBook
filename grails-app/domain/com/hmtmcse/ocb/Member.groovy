package com.hmtmcse.ocb

class Member {

    Integer id
    String firstName
    String lastName
    String email
    String password
    String memberType = GlobalConfig.USER_TYPE.REGULAR_MEMBER
    String identityHash
    Date identityHashLastUpdate
    Boolean isActive = true

    Date dataCreated
    Date lastUpdated

    //adc constraints
    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
        lastName(nullable: true)
        identityHash(nullable: true)
        identityHashLastUpdate(nullable: true)
        dataCreated(nullable: true)
        lastUpdated(nullable: true)
    }


    // adc events
    def beforeInsert() {
        this.password = this.password.encodeAsMD5()
    }

    def beforeUpdate() {
        this.password = this.password.encodeAsMD5()
    }
}
