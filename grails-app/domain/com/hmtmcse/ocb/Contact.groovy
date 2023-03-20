package com.hmtmcse.ocb

class Contact {

    Integer id
    String name
    String image
    Member member

    Date dateCreated
    Date lastUpdated

    Set<ContactDetails> contactDetails
    Set<ContactGroup> contactGroup


    static hasMany = [contactDetails: ContactDetails, contactGroup: ContactGroup]

    static constraints = {
        image(nullable: true, blank: true)
    }

    static mapping = {
        version(false)
        contactDetails(cascade: 'all-delete-orphan') // When the contact is deleted, all the details are deleted
    }
}

/// Contact e ContactGroup: Many-to-Many
// ContactDetails pertence a Contact (one to many)